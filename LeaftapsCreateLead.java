package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsCreateLead {

	public static void main(String[] args) {
		// Setup the browser
		WebDriverManager.chromedriver().setup();
		// Lauch the browsser
		ChromeDriver driver = new ChromeDriver();
		// Open URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Trane");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("keerthana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajesh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KR");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Digital");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Emp-keerthana");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajeshkeerthan87@gmail.com");
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
