import java.lang.*;

/**
*
* @author krBello on 09/28/16
*/

public class Date {

	private int year;
	private int month;
	private int day;
	public static final String arrayMonth[] = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1000 || year > 9999) {
			throw new IllegalArgumentException("year must be between 1000 and 9999 only!");
		}
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("month must be between 1 and 12 only!");
		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if ((month == 2) && ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))) {
			if (day < 1 || day > 29) {
				throw new IllegalArgumentException("February leap year has 29 days only!");
			}
		} else {
				if (month == 2) {
					if (day < 1 || day > 28) {
						throw new IllegalArgumentException("February has 28 days only!");
					}
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day < 1 || day > 30) {
						throw new IllegalArgumentException(arrayMonth[month] + " has 30 days only!");
					}
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day < 1 || day > 31) {
						throw new IllegalArgumentException(arrayMonth[month] + " has 31 days only!");
					}
				}
			}
		this.day = day;

	}

	public Date() {
		year = 1000;
		month = 1;
		day = 1;
	}

	public Date(int year, int month, int day) {		
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void setDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public String toString() {
		return String.format("%02d/%02d/%02d", day, month, year);
	}
}