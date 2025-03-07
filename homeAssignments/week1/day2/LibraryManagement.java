package homeAssignments.week1.day2;

public class LibraryManagement {

		public static void main (String [] args) {
			Library ls = new Library();
			String b = ls.addBook("Calling Library Method");
			 ls.issueBook();
			 System.out.println(b);
			  
		 }
		
	}

