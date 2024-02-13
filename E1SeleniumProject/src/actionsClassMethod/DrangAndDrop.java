package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DrangAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		abc.manage().window().maximize();
		abc.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		abc.get("https://www.shoppersstack.com/");
		
		abc.findElement(By.id("loginBtn")).click();
		
		abc.findElement(By.id("Email")).sendKeys("cmane0123@gmail.com");
		
		abc.findElement(By.id("Password")).sendKeys("Chaitanya@8");
		
		abc.findElement(By.xpath("//span[text()='Login']")).click();
		
		abc.findElement(By.id("search")).sendKeys("iphone");
		
		abc.findElement(By.id("searchBtn")).click();
		
		
		
//		-
		

	}

}
