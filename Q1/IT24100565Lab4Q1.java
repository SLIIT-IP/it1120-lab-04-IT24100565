import java.util.*;
public class IT24100565Lab4Q1 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input a number: ");	
		int no=input.nextInt();
		
		if(no<0){
			System.out.println("The number is: Negative");
		}else if(no>0){
			System.out.println("The number is: Positive");
		}else{
			System.out.println("The number is zero");
		}
	}
}