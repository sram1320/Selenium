package Testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//*[@id=\'login\']/p[3]/input")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
       Select drpIndustry = new Select (driver.findElement(By.name("industryEnumId")));
       
       drpIndustry.selectByVisibleText("Aerospace");
		
       Select drpOwnership = new Select (driver.findElement(By.name("ownershipEnumId")));
       drpOwnership.selectByIndex(2);
       
       Select drpInitialteam = new Select (driver.findElement(By.id("initialTeamPartyId")));
       drpInitialteam.selectByValue("DemoSalesTeam1");
       
       
	}

}
