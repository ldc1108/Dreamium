/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.panel;

import com.std.model.appointment.RefAppointment;
import com.std.util.range.WeekRange;
import com.std.view.block.DayBlock;
import com.std.view.block.MonthlyDayBlock;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Isioma
 */
public class CalendarPanel extends JPanel {

    protected ArrayList<DayBlock> _blocks;
    protected Calendar _calendar;
    protected JPanel _content;
    protected JPanel _daysPanel;
    protected Hashtable<Integer, JLabel> _daysOfWeek;

    public CalendarPanel() {
        _blocks = new ArrayList<DayBlock>();
        _daysOfWeek = new Hashtable<Integer, JLabel>();
        _daysPanel = new JPanel();
        _daysPanel.setOpaque(false);
        _daysPanel.setLayout(new GridLayout(1, 7));

        _calendar = Calendar.getInstance();
        WeekRange week = new WeekRange();
        _calendar.setTime(week.getStartDate());
        while (_calendar.getTime().before(week.getEndDate())) {
            JLabel dayText = new JLabel(_calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()));
            dayText.setFont(dayText.getFont().deriveFont(13f).deriveFont(Font.BOLD));
            dayText.setOpaque(false);
            dayText.setHorizontalAlignment(SwingConstants.CENTER);
            _daysPanel.add(dayText);
            _daysOfWeek.put(_calendar.get(Calendar.DAY_OF_WEEK), dayText);
            _calendar.add(Calendar.DATE, 1);
        }

        _content = new JPanel();
        _content.setOpaque(false);

        setLayout(new BorderLayout());
        setOpaque(false);
        add(_daysPanel, BorderLayout.NORTH);
        add(_content, BorderLayout.CENTER);



    }
    
    public void addBlock(DayBlock block) {
        _blocks.add(block);
        _content.add(block);
        _calendar.add(Calendar.DATE, 1);
    }
    


    public void addAppointmentListener(MouseListener al) {
        for (DayBlock dayBox : _blocks) // for each day in the month
        {
            dayBox.addAppointmentMouseListener(al);
        }
    }

    public void buildPanel(Date d) {
    }
    
    public void update(Set<RefAppointment> as, Date cd, RefAppointment ca) {
    }
    
}
