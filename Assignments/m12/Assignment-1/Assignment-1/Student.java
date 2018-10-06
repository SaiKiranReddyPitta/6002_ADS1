
class Student implements Comparable <Student> {

	String name, rc;

	int m1, m2, m3, total, day, month, year;

	Student(String name, String dob, String m1, String m2, String m3, String total, String rc) {

		this.name = name;

		String[] a = dob.split("-");

		this.m1 = Integer.parseInt(m1);
		this.m2 = Integer.parseInt(m2);
		this.m3 = Integer.parseInt(m3);
		this.total = Integer.parseInt(total);
		this.year = Integer.parseInt(a[2]);
		this.month = Integer.parseInt(a[1]);
		this.day = Integer.parseInt(a[0]);
		this.rc = rc;



	}

	public int compareTo(Student other) {

		if (this.m2 > other.m2) return 1;

		if (this.m2 < other.m2) return -1;

		if (this.m3 > other.m3) return 1;

		if (this.m3 < other.m3) return -1;

		if (this.total > other.total) return 1;

		if (this.total < other.total) return -1;

		if (this.year > other.year) return 1;

		if (this.year < other.year) return -1;

		if (this.month > other.month) return 1;

		if (this.month < other.month) return -1;

		if (this.day < other.day) return 1;

		if (this.day > other.day) return -1;

		return 0;

	}

	public int compareAgain(Student other) {

		if((this.rc.equals("SC") || this.rc.equals("ST") || this.rc.equals("BC") && other.rc.equals("Open"))) {

			return 1;

		}

		if((other.rc.equals("SC") || other.rc.equals("ST") || other.rc.equals("BC") && this.rc.equals("Open"))) {

			return -1;

		}

		return 0;
	}

}