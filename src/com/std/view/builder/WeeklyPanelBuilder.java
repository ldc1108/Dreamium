/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.builder;

import com.std.view.panel.CalendarPanel;
import com.std.view.panel.WeeklyPanel;
import java.util.Date;

/**
 *
 * @author Isioma
 */
public class WeeklyPanelBuilder extends PanelBuilder {
    
    public WeeklyPanel _weeklyPanel;
    
    public WeeklyPanelBuilder(Date d) {
        _weeklyPanel = new WeeklyPanel();
        _currentPanel = _weeklyPanel;
    }
    
    
}
