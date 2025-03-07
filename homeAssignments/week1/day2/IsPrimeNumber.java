package homeAssignments.week1.day2;

public class IsPrimeNumber {
	public static void main(String[]args) {
		 int number = 0;
		 boolean a = false;
		 
		 if (number>1) {
		 for (int i = 2; i<=number-1; i++) {
			 if(number%i==0) {
				a = true;
				break;
			 } else {
				a = false;
			 }
			 
		 }
		 if (a == true) {
			 System.out.println(number +" is not prime number");
		 }else {
			 System.out.println(number +" is prime number");
		 }
		 
		 }else {
			 System.out.println("Given input is one or below than one");
		 }
	}

}
