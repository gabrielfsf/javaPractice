package assignments;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		Student s1 = new Student("Zulleth Romero", "606384859");
		s1.setPhoneNumber("480-234-9664");
		s1.setCity("Phoenix");
		s1.setState("AZ");
		s1.enroll("Math 101");
		s1.enroll("English 101");
		
		System.out.println(s1.toString());
		
		s1.showCourses();
		s1.checkBalance();
		s1.pay(250);
		
		Student s2 = new Student("Gabriel Ferraz", "606556628");
		s2.setPhoneNumber("323-301-9664");
		s2.setCity("Mesa");
		s2.setState("AZ");
		s2.enroll("Math 202");
		s2.enroll("English 202");
		
		System.out.println("\n" + s2.toString());
		
		s2.showCourses();
		s2.checkBalance();
		s2.pay(300);

	}

}
class Student {
	
	// Student properties
	private static int id = 1000;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phoneNumber;
	private String city;
	private String state;
	private String coursesEnrolled = "";
	private static final double courseCost = 450;
	private double balance = 0;
	
	// Constructor that takes only name and ssn as arguments
	public Student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		id++;
		this.email = name.replaceAll(" ", "").toLowerCase() + "@maricopa.gov";
		setUserID();
	}
	

	public String getUserID() {
		return userID;
	}

	public void setUserID() {
		int min = 1000;
		int max = 9000;
		int random = (int) (Math.random() * (max - min));
		random += min;
		this.userID = id + "" + random + ssn.substring(5);
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll(String course) {
		this.coursesEnrolled += "\n  - " + course;
		this.balance += courseCost;
	}

	public String showCourses() {
		System.out.println("COURSES ENROLLED: " + coursesEnrolled);
		return coursesEnrolled;
	}

	public double checkBalance() {
		System.out.println("BALANCE: $" + balance);
		return balance;
	}
	
	public void pay(double amount) {
		balance -= amount;
		System.out.println("Thank you for your payment of $" + amount + "\nYour new balance is: $" + balance);
	} 
	
	@Override
	public String toString() {
		return "STUDENT: " + name +
				"\nSTUDENT ID: " + userID +
				"\nEMAIL: " + email +
				"\nPHONE NUMBER: " + phoneNumber +
				"\nLOCATION: " + city + ", " + state;
	}	
}
