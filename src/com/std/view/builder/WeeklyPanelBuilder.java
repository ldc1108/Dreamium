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
        _weeklyPanel = new WeeklyPanel(d);
        _currentPanel = _weeklyPanel;
    }
    @Override
    public CalendarPanel getResult() {
        return _currentPanel;
    }

    @Override
    public void buildPart(Date d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
