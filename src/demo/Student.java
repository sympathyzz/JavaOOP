package demo;

public class Student {
	String names;
	int age;
	String gender;
	String IDNO;
	public Student(String names, int age, String gender, String iDNO) {
		super();
		this.names = names;
		this.age = age;
		this.gender = gender;
		IDNO = iDNO;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIDNO() {
		return IDNO;
	}
	public void setIDNO(String iDNO) {
		IDNO = iDNO;
	}
	
}
