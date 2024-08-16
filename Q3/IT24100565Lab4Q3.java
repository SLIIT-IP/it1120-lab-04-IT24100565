import java.util.*;
public class IT24100565Lab4Q3 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input a number: ");	
		int no=input.nextInt();
		
		String msg;
		
		msg=(no<0)? "Negative" : (no>0)? "Positive" : "Number is zero";
		
		System.out.print(msg);
	}
}