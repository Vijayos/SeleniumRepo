package homeAssignments.week1.day2;

public class EdgeBrowser {
	
	public static void main(String [] args) {
		Browser bne = new Browser();
		String dName = bne.launchBrowser("Edge Browser");
		System.out.println(dName);
		bne.loadUrl();
	}

}
