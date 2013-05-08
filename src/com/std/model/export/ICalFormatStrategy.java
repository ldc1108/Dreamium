package com.std.model.export;

import java.util.Date;
import java.util.Set;

import com.std.model.appointment.RefAppointment;

public class ICalFormatStrategy implements ExportFormatStrategy {

	// we need summary, start date, end date, date creation, Repeat
	@Override
	public String format(java.util.Collection<RefAppointment> appts) {
		String outputString = "";
		for ( RefAppointment appointment : appts){
			String summary = appointment.getDescription();
			Date startDT = appointment.getStartDate();
			Date endDT = appointment.getEndDate();
			Set<Date> repeatDTs = appointment.getPattern().getDates();
		}
		return outputString;
	}

}
