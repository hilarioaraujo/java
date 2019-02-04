package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		// Set the calendar time as d
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		// add 4 hours
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();

		System.out.println(sdf.format(d));

		// Get minutes and hours of a date
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);

		// Get the month - the month in java begin in 0
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);
	}

}
