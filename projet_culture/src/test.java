import java.util.Calendar;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1653,12,1);
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

	}

}
