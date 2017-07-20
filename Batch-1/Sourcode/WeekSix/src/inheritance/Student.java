package inheritance;

public class Student{
	
	public Student() {
		super();
		this.name = "";
		this.id = "";
		this.mobile = "";
//System.out.println("Hello I am Student");
	}
	
	public Student(String name, String id, String mobile) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		
		System.out.println("Hello I am Student,Name "+name+"\n Id : "+id+"\n Mobile : "+mobile);

	}

	private String name;
	private String id;
	private String mobile;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	
	public void showDetails(){
		String details="Student Name :"+getName()+",Student Id :"+getId()+",Student Mobile :"+getMobile();
		System.out.println(details);
	}
}