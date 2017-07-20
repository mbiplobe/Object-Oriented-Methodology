package polymorphism;

public class Polimorphism {

	public static void main(String[] args) {
		CSEStudent cseStudent=new CSEStudent();
		
		cseStudent.setId("03...");
		cseStudent.setMobile("017..");
		cseStudent.setName("M..");

		/*Runtime polymorphism*/
		cseStudent.show();
		
		
		/*Compile Time Polymorphism*/
		cseStudent.showAbility(2);
		cseStudent.showAbility("Math");

	}

}
