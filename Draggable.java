package week4.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the URL
		driver.get("https://jqueryui.com/draggable/");
		//Create object for Actions Class
		Actions builder=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(element, 100, 100).perform();

	}

}
