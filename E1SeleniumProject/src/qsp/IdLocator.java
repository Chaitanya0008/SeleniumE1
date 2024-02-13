package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		abc.manage().window().maximize();
		abc.get("https://app.fireflink.com/signin");
		
		WebElement fireflinkTextBox = abc.findElement(By.id("mui-1"));
		fireflinkTextBox.sendKeys("cmane0123@gmail.com");
		Thread.sleep(3000);
		
		WebElement fireflinkPasswordTextBox = abc.findElement(By.id("mui-2"));
		fireflinkPasswordTextBox.sendKeys("Chaitanya@8");
		Thread.sleep(3000);
		
		WebElement fireflinkButton = abc.findElement(By.tagName("primary-btn"));
		fireflinkButton.click();
		
	}

}
