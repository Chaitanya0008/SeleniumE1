package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		abc.manage().window().maximize();
		abc.get("https://www.flipkart.com/");
		
		 abc.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
		 abc.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(1000);
		
		
		WebElement fliterBrandDropdown = abc.findElement(By.xpath("//div[text()='Brand']"));
		fliterBrandDropdown.click();
		Thread.sleep(1000);
		
		
		WebElement clickOnHPBrand = abc.findElement(By.xpath("//div[text()='HP']"));
		clickOnHPBrand.click();
		Thread.sleep(1000);
		
		
		WebElement clickOnPROCESSOR = abc.findElement(By.xpath("//div[text()='Processor Generation']"));
		clickOnPROCESSOR.click();
		Thread.sleep(1000);
		
		
		abc.findElement(By.xpath("//div[text()='10th Gen']")).click();
		//abc.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(1000);
		
		WebElement clickOnOperatingSysteam = abc.findElement(By.xpath("//div[text()='Operating System']"));
		clickOnOperatingSysteam.click();
		Thread.sleep(1000);
		
		
		WebElement clickOnWindows10 = abc.findElement(By.xpath("//div[text()='Windows 10']"));
		clickOnWindows10.click();
		Thread.sleep(1000);
		
		
		List<WebElement> laptopHP = abc.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> laptopPrice = abc.findElements(By.xpath("//div[@class='_3pLy-c row'] / descendant :: div[@class='_30jeq3 _1_WHN1']"));
		
		for (int i = 0; i < laptopHP. size (); i++)
		{
		String ops = laptopHP.get(i).getText () ;
		
		for (int j = i ; j <= i ; j++) 
		{
		  String price = laptopPrice.get (j).getText ();
		System.out.print (ops +":" + price );
		Thread. sleep (2000) ;
		}
		System. out. println ("") ;
		}
//		for (WebElement as : laptopPrice) 
//		{
//		    String priceOptions = as.getText();
////		    System.out.println(priceOptions);
//		    Thread.sleep(1000);
//		
//
//		for (WebElement we : laptopHP) {
//		    String options = we.getText();
//		    System.out.println(options + "--->" + priceOptions);
//		    Thread.sleep(1000);
//		}
//		}
	}


	}


