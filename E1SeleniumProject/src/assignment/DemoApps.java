package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	
	WebElement web = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	
	driver.switchTo().frame(web);
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("qwertyu");
	driver.switchTo().defaultContent();
	driver.findElement(By.partialLinkText("Nested iframe")).click();
	
	

	}

}
