package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		abc.manage().window().maximize();
		abc.get("https://app.fireflink.com/signin");
		
		WebElement fireflinkTextBox = abc.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		fireflinkTextBox.sendKeys("cmane0123@gmail.com");
		Thread.sleep(3000);
		
		WebElement fireflinkPasswordTextBox = abc.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		fireflinkPasswordTextBox.sendKeys("Chaitanya@8");
		Thread.sleep(3000);
		
		WebElement fireflinkButton = abc.findElement(By.xpath("//button[@type='submit']"));
		fireflinkButton.click();
		
	}

}
