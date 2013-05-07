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
        _dailyPanel = new DailyPanel(d);
        _currentPanel = _dailyPanel;
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
