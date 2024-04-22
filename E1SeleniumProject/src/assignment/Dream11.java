package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dream11.com/");
        
         //WebDriverWait wait = new WebDriverWait(driver.)
    //driver.switchTo().frame(0);
      //driver.switchTo().frame("send-sms-iframe");
        
   WebElement fr = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
   driver.switchTo().frame(fr);
        
       driver.findElement(By.id("regEmail']")).sendKeys("418529637");
	}

}
