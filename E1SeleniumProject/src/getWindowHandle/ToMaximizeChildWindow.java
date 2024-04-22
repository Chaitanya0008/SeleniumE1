package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeChildWindow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String wh:allwindow )
		{
			String title = driver.switchTo().window(wh).getTitle();
		
		if(title.equals(allwindow))
			}
		}

}
