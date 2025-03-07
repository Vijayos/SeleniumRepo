package homeAssignments.week1.day2;

public class FibonnaciSeries {
	 public static void main(String args[]) {
		 int range = 8;
		 int result ;
		 int firstNo= 0, secondNo = 1;
		 for( int i = 1;i<=range;i++) {
			 System.out.println(firstNo);
			result = firstNo +secondNo;
			firstNo = secondNo;
		    secondNo = result;
		 }
 
	 }

}
