package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartFindWebElements {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/search?q=laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=laptop%7CLaptops&requestId=8d0a674c-8113-4ebe-a33f-e04fded4a911&as-searchtext=laptop&p%5B%5D=facets.brand%255B%255D%3DHP&p%5B%5D=facets.processor%255B%255D%3DCore%2Bi5&p%5B%5D=facets.operating_system%255B%255D%3DWindows%2B10");
			Thread.sleep(2000);
			
			WebElement activeEle = driver.switchTo().activeElement();
			activeEle.sendKeys("Laptop");
			Thread.sleep(2000);
			
			List<WebElement> laptopHP = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			
			for(WebElement as:laptopPrice)
			{
				String priceOptions = as.getText();
				System.out.println(priceOptions);
				
			
			
			for(WebElement we:laptopHP)
			{
				String options = we.getText();
				System.out.println(options +"--->"+ priceOptions );
				//Thread.sleep(1000);
			}
			}
		}
}
	
	


