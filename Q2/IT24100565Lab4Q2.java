import java.util.*;
public class IT24100565Lab4Q2 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
				
		System.out.print("Please enter exam marks (out of 100) : ");	
		double marks=input.nextDouble();
		double labmarks;
		
		if(0<= marks && marks>=100){
			System.out.print("Invalid input for exam marks. Terminating program.");
		}else{
			System.out.print("Please enter lab submission (out of 100) : ");	
			labmarks=input.nextDouble();

			System.out.print("Please enter the percentage given for the exam : ");	
			double permarks=input.nextDouble();
	
			System.out.print("Please enter the percentage given for the lab submission: ");	
			double perlab=input.nextDouble();
			
			if(permarks+perlab!=100){
				System.out.print("The percentages must add up to 100. Terminating program.");		
			}else{
				double tot=(marks*(permarks/100))+(labmarks*(perlab/100));
				System.out.print("Final Exam Mark is :"+tot);
			}
		
		}
	}
}