
public class Student {
	
	private int no;
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	
	public String getNameo() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override 
	public int hashCode() {
		return no;
	}
	
	@Override 
	public boolean equals(Object object) {
		Student student = (Student) object;
		return student.no == this.no;
	}
	
	@Override 
	public String toString() {
		return "No: " + no + "İsim: " + name + "Yaş: " + age;
	}




}
