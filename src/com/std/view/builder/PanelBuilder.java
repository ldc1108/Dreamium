/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.builder;

import com.std.model.appointment.RefAppointment;
import com.std.util.range.DateRange;
import com.std.view.panel.CalendarPanel;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Isioma
 */
public class PanelBuilder {
    CalendarPanel _currentPanel;
    
    public CalendarPanel getResult(){
        return _currentPanel;
    }
    
    public void buildPart(Date d) {
        _currentPanel.buildPanel(d);
        _currentPanel.update(new HashSet<RefAppointment>(), d, null);
    }
}
