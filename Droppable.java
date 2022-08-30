package week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Launch the URL
		driver.get("https://jqueryui.com/droppable/");
		// To Switch the control to Frames both are inside the frames
        driver.switchTo().frame(0);
        //Find Xpath for Draggable
        WebElement findElement1 = driver.findElement(By.id("draggable"));
        //Find Xpath for Droppable
        WebElement findElement2 = driver.findElement(By.id("droppable"));
        //Create object for Actions Class
        Actions builder=new Actions(driver);
        builder.dragAndDrop(findElement1, findElement2).perform();
        
        
	}

}
