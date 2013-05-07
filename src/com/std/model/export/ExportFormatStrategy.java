package com.std.model.export;

import com.std.model.appointment.RefAppointment;

/**
 * 
 * 
 * @author Dreamium
 */
public interface ExportFormatStrategy {
	
	/**
	 * 
	 * 
	 * @param appointment
	 * @return
	 */
	public String format(java.util.Collection<RefAppointment> appts);
	
}
