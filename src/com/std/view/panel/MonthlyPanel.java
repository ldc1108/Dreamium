package com.std.view.panel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.std.model.appointment.RefAppointment;
import com.std.util.range.MonthRange;
import com.std.util.range.WeekRange;
import com.std.view.block.DayBlock;
import com.std.view.block.MonthlyDayBlock;

/**
 * This class represents the month view, it contains all the information needed
 * to maintain an updated look at the month, including ways to move to the next
 * month and previous month and to add and remove current appointments, the
 * appointments are displayed in less detail in the month view then in the week
 * view. Only the titles of each appointment are displayed in this view.
 *
 * @author xxx
 *
 */
public class MonthlyPanel extends CalendarPanel {

//	private List<MonthlyDayBlock> blocks;
    /**
     * This is the constructor it initializes all the variables needed and then
     * updates the view to display the appointment set sent as an argument.
     */
    public MonthlyPanel(Date date) {
        super();
        _content.setLayout(new GridLayout(0, 7));
    }

    @Override
    public void buildPanel(Date date) {
        MonthRange gRange = new MonthRange(date);
        _calendar.setTime(gRange.getStartDate());
        while (_calendar.getTime().before(gRange.getEndDate())) {
            MonthlyDayBlock block = new MonthlyDayBlock(_calendar.getTime());
            addBlock(block);
        }
    }

    /**
     *
     * @param dl is the dayListener to set to each MonthlyDayBlock
     */
    public void addDayListener(ActionListener dl) {
        for (DayBlock dayBox : _blocks) { // for each day in the month
            dayBox.addActionListener(dl);
        }
    }

    /**
     *
     * @param al is the appointmentListener to set to each appointment in each
     * MonthlyDayBlock
     */
//	public void addAppointmentListener(MouseListener al) {
//		for(MonthlyDayBlock dayBox : blocks) // for each day in the month
//			dayBox.addAppointmentActionListener(al);
//	}
//	/**
//	 * 
//	 *update the panel's entire display
//	 *this method is to be called any time the appointment set is changed.
//	 *this method is also to be called any time the view is changed
//	 */
    @Override
    public void update(Set<RefAppointment> as, Date cd, RefAppointment ca) {

        Calendar curcal = Calendar.getInstance();
        curcal.setTime(cd);

        Calendar tmpCal = Calendar.getInstance();
        MonthRange gRange = new MonthRange(cd);
        for (int i = 0; i < ((ArrayList<DayBlock>) _blocks).size(); i++) { // for each day in the month
            tmpCal.setTime(gRange.getStartDate());
            tmpCal.add(Calendar.DATE, i);

            MonthlyDayBlock dayBox = (MonthlyDayBlock) ((ArrayList<DayBlock>) _blocks).get(i);
            dayBox.setSelected(tmpCal.get(Calendar.DAY_OF_YEAR) == curcal.get(Calendar.DAY_OF_YEAR));
            dayBox.setEnabled(tmpCal.get(Calendar.MONTH) == curcal.get(Calendar.MONTH));
            dayBox.update(as, tmpCal.getTime(), ca);
        }
    }
}
