package com.std.model.export;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import com.std.model.appointment.RefAppointment;

public class ICalFormatStrategy implements ExportFormatStrategy {

	// we need summary, start date
	@Override
	public String format(java.util.Collection<RefAppointment> appts) {
		String outputString = "BEGIN:VCALENDAR\n";
		for ( RefAppointment appointment : appts){
			String summary = "SUMMARY:" + appointment.getTitle() + "\n";
			for ( Date date : appointment.getPattern().getDates()){
				outputString = outputString.concat("BEGIN:VEVENT\n");
				String startStr = "DTSTART:" + (date.getYear()+1900) + String.format("%02d",date.getMonth()+1) + String.format("%02d",date.getDate()) + "T" + String.format("%02d",date.getHours()) + String.format("%02d",date.getMinutes()) + String.format("%02d",date.getSeconds()) + "\n";
				String endStr = "DTEND:" + (date.getYear()+1900) + String.format("%02d",date.getMonth()+1) + String.format("%02d",date.getDate()) + "T" + String.format("%02d",appointment.getEndDate().getHours()) + String.format("%02d",appointment.getEndDate().getMinutes()) + String.format("%02d",appointment.getEndDate().getSeconds()) + "\n";
				outputString = outputString.concat(summary);
				outputString = outputString.concat(startStr);
				outputString = outputString.concat(endStr);
				outputString = outputString.concat("END:VEVENT\n");
			}
		}
		outputString = outputString.concat("END:VCALENDAR\n");
		return outputString;
	}

}
