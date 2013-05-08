/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.std.controller.listener;

import com.std.controller.CalendarController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author luke
 */
public class ExportIcalActionListener implements ActionListener {

    private CalendarController cc;
    
    public ExportIcalActionListener(CalendarController cc) {
        this.cc = cc; 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        this.cc.exportIcal();
    }
    
}
