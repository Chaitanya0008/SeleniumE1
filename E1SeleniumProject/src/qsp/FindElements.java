package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?safe=active&ssui=on");
		Thread.sleep(2000);
		
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("bikes");
		Thread.sleep(2000);
		
		List<WebElement> bikesOption = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		//for(int i=0; i<bikesOption.size(); i++)
		//{
		//	String ops = bikesOption.get(i).getText();
		//	System.out.println(ops);
		//	Thread.sleep(1000);
	//}
		
		for(WebElement we:bikesOption)
		{
			String options = we.getText();
			System.out.println(options);
			Thread.sleep(1000);
		}
	}
}
