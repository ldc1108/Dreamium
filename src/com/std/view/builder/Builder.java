/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.view.builder;

import com.std.view.panel.CalendarPanel;
import java.util.Date;

/**
 *
 * @author Isioma
 */
public interface Builder {
    CalendarPanel getResult();
    void buildPart(Date d);
}
