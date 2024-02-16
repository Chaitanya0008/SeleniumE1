package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class BlueStoneSS {

	public static void main(String[] args) {
		
		 
				
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bluestone.com/");
        
         //WebDriverWait wait = new WebDriverWait(driver.)
       driver.findElement(By.xpath("//span[@id ='denyBtn']")).click();
        WebElement coin = driver.findElement(By.id("goldCoins"));
        
        act.moveToElement(coin);
        driver.findElement(By.xpath("//span[text()='1 gram' and @class='prcs-d' and @data-p='gold-coins-weight-1gms,m']")).click();
      
	}

}
