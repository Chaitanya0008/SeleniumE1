package javascriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        //Thread.sleep(5000);
        
        driver.findElement(By.xpath("//li[text()='Disabled']")).click();
        //Thread.sleep(2000);
        
        WebElement disebleElement = driver.findElement(By.id("name"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
	}

}
