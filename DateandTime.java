package pack1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateandTime {
	public static void main(String args[]) {
		LocalDate d1=LocalDate.now();
		System.out.println("Current date "+d1);
		LocalTime d2=LocalTime.now();
		System.out.println("CUrrent Time "+d2);
		LocalDateTime d3=LocalDateTime.now();
		System.out.println("Current Date and Time "+d3);
		DateTimeFormatter formatingtype=DateTimeFormatter.ofPattern(" dd-mm-yyyy HH:MM:SS");
		String formateddatetime=d3.format(formatingtype);
		System.out.println("Formated Time "+formateddatetime);
		System.out.println(d3.equals(formateddatetime));
		System.out.println(d3.getDayOfMonth());
		System.out.println(d3.getDayOfYear());
		System.out.println(d3.getHour());
		System.out.println(d3.isBefore(d3));
		
	}

}
