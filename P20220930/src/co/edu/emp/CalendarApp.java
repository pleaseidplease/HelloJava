package co.edu.emp;

public class CalendarApp {
	public static void main(String[] args) {
		MethodCalendar cal=MethodCalendar.getInstance();
		for(int i=1;i<=12;i++) {
		cal.makeCal(2022,i);
		}
	}
}
