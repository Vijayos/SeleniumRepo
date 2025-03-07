package homeAssignments.week1.day2;

public class Library {
	 String addBook(String bookTitle) {
		 System.out.println("Book added successfully");
		 return bookTitle;
	 }
	 
	 public void issueBook() {
		 System.out.println("Book issued successfully");
	 }
	
	public static void main (String [] args) {
		Library lb = new Library();
		String a =lb.addBook("Java Learning");
		lb.issueBook();
		System.out.println(a);
	}

}
