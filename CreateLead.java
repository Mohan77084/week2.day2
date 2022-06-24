package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click();
		WebElement leadElement = driver.findElement(By.linkText("Leads"));
		leadElement.click();
		WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
		createleadElement.click();
		WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companynameElement.sendKeys("TestLeaf");
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Mohan");
		WebElement lasttnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lasttnameElement.sendKeys("P B");
		WebElement firstnamelocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnamelocalElement.sendKeys("Mohan");
		WebElement departmentnameElement = driver.findElement(By.name("departmentName"));
		departmentnameElement.sendKeys("Sales");
		WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
		descriptionElement.sendKeys("xxxx-xxxxx-xxxxxxxxxx");
		WebElement primaryEmailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmailElement.sendKeys("mohan@gmail.com");
		WebElement stateprovincedropdownElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(stateprovincedropdownElement);
		dd.selectByVisibleText("New York");
		WebElement submitbuttonElement = driver.findElement(By.name("submitButton"));
		submitbuttonElement.click();
		System.out.println("The title of the page is : " +driver.getTitle());	
	}
}