package polymorphism;

public class CSEStudent extends Student {

/*	public void showStudentDetails() {
		super.showStudentDetails();
	}*/
	
	public void show() {
		System.out.println("Hello I am CSE Student");
	}
	
	public void showAbility( int level){
		String grade="";
		switch(level){
	
		case 1:{
			grade="Low";
			break;
		}
		case 2:{
			grade="Midium";
			break;
		}
		
		default:{
			grade="High";
			break;
		}
		
		}
		System.out.println(grade);
	}
	
	public void showAbility(String level){
		String grade="";
		switch(level){
	
		case "Math":{
			grade="Great Mathmatician";
			break;
		}
		case "C":{
			grade="Great Programmer on C Language";
			break;
		}
		
		default:{
			grade="Great Algorithmist";
			break;
		}
		
		}
		System.out.println(grade);
	}
	
	

}
