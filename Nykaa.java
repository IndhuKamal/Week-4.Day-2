package week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(findElement).perform();
	    driver.findElement(By.xpath("//img[contains(@src,'lorealparis')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("L'Oreal Paris Products")) {
			System.out.println("Loreal Brand Page is displayed");
		} else {
			System.out.println("Loreal Brand Page is not displayed");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		WebElement categoryElement= driver.findElement(By.xpath("//span[text()='Category']"));
		driver.executeScript("arguments[0].click();",categoryElement);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).getText();
		if (text.contains("Shampoo")) {
			System.out.println("Shampoo is filtered");
		} else {
			System.out.println("Shampoo is not filtered");
		}
		driver.findElement(By.xpath("//div[@class='css-1rd7vky']//div")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList=new ArrayList<String>(windowHandles);
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='css-11wjdq4']//select"));
		Select dd = new Select(dropDown);
		dd.selectByVisibleText("175ml");
		String string = driver.findElement(By.xpath("//div[@class='css-1d0jf8e']//span[2]")).getText();
	    System.out.println("Mrp of the product is " + string);
	    driver.findElement(By.xpath("//div[@class='css-vp18r8']/button[@class=' css-12z4fj0']")).click();
		
	}

}
