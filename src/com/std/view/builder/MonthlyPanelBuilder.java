/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.builder;

import com.std.model.appointment.RefAppointment;
import com.std.view.panel.CalendarPanel;
import com.std.view.panel.MonthlyPanel;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Isioma
 */
public class MonthlyPanelBuilder extends PanelBuilder {

    private MonthlyPanel _monthlyPanel;
    
    public MonthlyPanelBuilder(Date d) throws IOException {
        _monthlyPanel = new MonthlyPanel(d);
        _currentPanel = _monthlyPanel;
    }
    
    
}