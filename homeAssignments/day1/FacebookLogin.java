package homeAssignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("testleaf.20232gmail.com");
	WebElement ele = driver.findElement(By.id("pass"));
	ele.sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	WebElement faccount = driver.findElement(By.linkText("Find your account and log in."));
    faccount.click();
	String currentpage = driver.getTitle();
	System.out.println(currentpage);
	}

}
