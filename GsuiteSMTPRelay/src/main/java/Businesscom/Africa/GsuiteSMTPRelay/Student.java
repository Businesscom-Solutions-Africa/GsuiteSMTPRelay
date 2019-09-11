package Businesscom.Africa.GsuiteSMTPRelay;

public class Student {

	private String name;
	private String school;
	private String classes;
	
	public Student() {
		
	}
	
	
	public Student(String name, String school, String classes) {
		super();
		this.name = name;
		this.school = school;
		this.classes = classes;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	
	
}
