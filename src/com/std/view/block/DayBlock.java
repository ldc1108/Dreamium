package com.std.view.block;

import java.awt.event.MouseListener;
import java.util.Date;
import javax.swing.JToggleButton;

/**
 * This interface allows the listeners to figure out the date 
 * of the dayblock that was clicked on
 * 
 * @author xxx
 *
 */

public abstract class DayBlock extends JToggleButton {
    
    /**
	 * this is the action listener that will be listening to
	 * all of the AppointmentReadViews
	 */
	protected MouseListener appointmentListener;
	

	/**
	 * This method returns the date of the day block
	 * 
	 * @return returns the date 
	 */
	
	public abstract Date getDate();
        
        /**
	 * This allows the mouseListener for the appointment views to be set
	 * @param list is the MouseListener to be set
	 */
	
	public void addAppointmentMouseListener(MouseListener list) {
		appointmentListener = list;
	}
	
}
