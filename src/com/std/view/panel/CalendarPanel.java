/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.panel;

import com.std.view.block.DayBlock;
import com.std.view.block.MonthlyDayBlock;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Isioma
 */
public class CalendarPanel extends JPanel  {
    protected Iterable<DayBlock> blocks;
    
    public void addAppointmentListener(MouseListener al) {
            for(DayBlock dayBox : blocks) // for each day in the month
            {
                dayBox.addAppointmentMouseListener(al);
            }
    }
}
