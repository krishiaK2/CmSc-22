import java.lang.*;

/**
*
* @author krBello
*/

public class Date {

	private int year = 1000;
	private int month = 1;
	private int day = 1;

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

		if (month == 2) {
			if (day < 1 || day > 28) {
				throw new IllegalArgumentException("FEB has only 28 days!");
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					throw new IllegalArgumentException("This month has 30 days only!");
				}
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day < 1 || day > 31) {
					throw new IllegalArgumentException("This month has 31 days only!");
				}
			}
		} else {
			if ((month % 4 == 0) || (month % 100 == 0 && month % 400 == 0)) {
				if (month == 2) {
					if (day < 1 || day > 29) {
						throw new IllegalArgumentException("FEB leap year has 29 days only!");
					}
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day < 1 || day > 30) {
						throw new IllegalArgumentException("This month has 30 days only!");
					}
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (day < 1 || day > 31) {
						throw new IllegalArgumentException("This month has 31 days only!");
					}
				}
			}
		}
		this.day = day;
	}

	// public Date() {

	// 	this.year = 1000;
	// 	this.month = 1;
	// 	this.day = 1;

	// }

	public Date(int year, int month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
		
	}

	public void setDate(int year, int month, int day) {

		this.year = year;
		this.month = month;
		this.day = day;

	}

	public String toString() {
		return String.format("%02d/%02d/%02d", this.day, this.month, this.year);
	}
}