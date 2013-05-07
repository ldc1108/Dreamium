/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.builder;

import com.std.view.panel.CalendarPanel;
import com.std.view.panel.DailyPanel;
import java.util.Date;

/**
 *
 * @author Isioma
 */
public class DailyPanelBuilder extends PanelBuilder {
    
    private DailyPanel _dailyPanel;
    
    public DailyPanelBuilder(Date d) {
        _dailyPanel = new DailyPanel();
        _currentPanel = _dailyPanel;
    }
    
}
