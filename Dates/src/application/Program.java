package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Get the time zone of GMT
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("Y1: " + sdf1.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));

		Date x1 = new Date();
		System.out.println("X1: " + sdf2.format(x1));

		Date x2 = new Date(System.currentTimeMillis());
		System.out.println("X2: " + sdf2.format(x2));

		// number of milliseconds since 0000 of 1fs of January of 1970 GMT (UTC)
		Date x3 = new Date(0L);
		System.out.println("X3: " + sdf2.format(x3));

		// number of milliseconds since 0500 of 1fs of January of 1970 GMT (UTC)
		Date x4 = new Date(1000L * 60L * 60L * 5);
		System.out.println("X4: " + sdf2.format(x4));

		// --------------------------------//
		System.out.println("-------------------------");
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
	}

}
