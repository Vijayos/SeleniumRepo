package homeAssignments.week1.day2;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String [] args) {
		Browser br = new Browser();
		String bName=br.launchBrowser("Chrome Browser");
		System.out.println(bName);
		br.loadUrl();
		
		
	}

}
