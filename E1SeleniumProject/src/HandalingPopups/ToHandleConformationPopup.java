package HandalingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleConformationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        //Thread.sleep(5000);
        
        driver.findElement(By.id("confirm")).click();
        //Thread.sleep(2000);
        
         Alert conformationAlert = driver.switchTo().alert();
         
         conformationAlert.accept();

	}

}
