package com.std.model.export;

import com.std.model.appointment.RefAppointment;

public interface ExportFormatStrategy {
	public String format(RefAppointment appointment);
}
