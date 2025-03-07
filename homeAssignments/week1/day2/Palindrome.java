package homeAssignments.week1.day2;

public class Palindrome {
	
	public static void main(String [] args) {
		 int input = 1213;
		 int temp = input;
		 int output = 0;
		 int rem ;
		 for (int i = input ;  i>0 ; i=i/10) {
		rem = temp%10;
		output = (output*10)+rem;
		temp = temp/10;
		 }
		 if (input == output) {
		 System.out.println("This is Palindrome number");
		 }else {
			 System.out.println("This is not Palindrome number");
		 }
		
	}

}
