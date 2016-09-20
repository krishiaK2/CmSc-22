import java.lang.*;

/**
*
* @author krBello
*/

public class Date {

	private int year;
	private int month;
	private int day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1000 || year > 9999) {
			throw new IllegalArgumentException("illegal year!");
		}
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("illegal month!");
		}
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {

		if ((this.month == 2) && !((this.year % 400 == 0) || (this.year % 100 != 0 && this.year % 4 == 0))) {
			if (day < 1 || day > 28) {
				throw new IllegalArgumentException("FEB has only 28 days!");
			} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
				if (day < 1 || day > 30) {
					throw new IllegalArgumentException("This month has 30 days only!");
				}
			} else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
				if (day < 1 || day > 31) {
					throw new IllegalArgumentException("This month has 31 days only!");
				}
			}
		} else {
			if ((this.year % 400 == 0) || (this.year % 100 != 0 && this.year % 4 == 0)) {
				if (this.month == 2) {
					if (day < 1 || day > 29) {
						throw new IllegalArgumentException("FEB leap year has 29 days only!");
					}
				} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
					if (day < 1 || day > 30) {
						throw new IllegalArgumentException("This month has 30 days only!");
					}
				} else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
					if (day < 1 || day > 31) {
						throw new IllegalArgumentException("This month has 31 days only!");
					}
				}
			}
		}
		this.day = day;

	}

	public Date() {
		this.year = 1000;
		this.month = 1;
		this.day = 1;
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
