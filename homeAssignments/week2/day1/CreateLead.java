package homeAssignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("OS");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VBOS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Nammadha");
		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		
	}
}
