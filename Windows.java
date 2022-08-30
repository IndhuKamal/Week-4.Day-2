package week4.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://www.leafground.com/pages/Window.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
    Set<String> windowHandles = driver.getWindowHandles();
    System.out.println(windowHandles);
    List<String> handles = new ArrayList<String>(windowHandles);
    driver.switchTo().window(handles.get(1));
    System.out.println(driver.getTitle());
    
	}
}
