package finalMock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.zomato.com/india");
        String parentHandle = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollTarget = driver.findElement(By.xpath("//h6[@class='sc-elhb8j-8 fvpjYk']"));
        js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
        driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo' and @target='_blank'][1]")).click();
        String linkdinWebPage = driver.getTitle();
        driver.switchTo().window(parentHandle);
        js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
        driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo' and @target='_blank'][2]")).click();
        driver.switchTo().window(parentHandle);
        js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
        driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo' and @target='_blank'][3]")).click();
        driver.switchTo().window(parentHandle);
        js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
        driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo' and @target='_blank'][4]")).click();
        driver.switchTo().window(parentHandle);
        js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
        driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo' and @target='_blank'][5]")).click();
        
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String wh : allWindowHandles)
        {
        	if (wh.equals(linkdinWebPage))
        		driver.switchTo().window(linkdinWebPage);
        	
        	
        	
         
        }
        
        
        
	}

}
