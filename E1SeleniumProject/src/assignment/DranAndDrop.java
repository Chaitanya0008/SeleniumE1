package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DranAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver abc = new EdgeDriver();
		WebDriver abc = new ChromeDriver();
		abc.manage().window().maximize();
		abc.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(abc);
		
		abc.findElement(By.xpath("//div[text()='10th Gen']")).click();
		
		abc.get("https://trello.com/b/dpjMIatR/cm");
		
		
		WebElement sqlClick = abc.findElement(By.xpath("//a[text()='SQL']"));
		Thread.sleep(5000);
		
		WebElement sqlDrop = abc.findElement(By.xpath("//h2[text()='Mock Attended']"));
		Thread.sleep(5000);
		
//		abc.findElement(By.id("Email")).sendKeys("cmane0123@gmail.com");
//		
//		abc.findElement(By.id("Password")).sendKeys("Chaitanya@8");
//		
//		abc.findElement(By.xpath("//span[text()='Login']")).click();
		act.dragAndDrop(sqlClick, sqlDrop).perform();
	}

}
