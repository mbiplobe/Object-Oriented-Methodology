package arrays;

public class SingleDimentionArray {

	public static void main(String[] args) {
		
		double []marks={12.3,45.24,85,67.58};
		 
		double average=calculateAverageMark(marks);
		
		System.out.println(average);
	}
	
	private static double calculateAverageMark(double []marks){
		double average=0;
		
		for(int i=0;i<marks.length;i++){
			average+=marks[0];
		}
		
		return average;
	}

}
