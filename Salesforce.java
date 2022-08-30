package week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  ChromeDriver driver=new ChromeDriver(option);
      driver.manage().window().maximize();
	  driver.get("https://login.salesforce.com/");
	  WebElement usernameElement = driver.findElement(By.id("username"));
	  usernameElement.sendKeys("ramkumar.ramaiah@testleaf.com");
	  WebElement passwordElement = driver.findElement(By.id("password"));
	  passwordElement.sendKeys("Password@123");
	  WebElement loginElement = driver.findElement(By.id("Login"));
	  loginElement.click();
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	  Thread.sleep(4000);
	 
	  WebElement viewAllElement = driver.findElement(By.xpath("//button[@class='slds-button']"));
	  viewAllElement.click();
	  WebElement dashboardElement = driver.findElement(By.xpath("//p[text()='Dashboards']"));
	  dashboardElement.click();
	  WebElement newDashboardElement = driver.findElement(By.xpath("//div[text()='New Dashboard']"));
	  newDashboardElement.click();
	  
	  
	  
	  
	}

}
