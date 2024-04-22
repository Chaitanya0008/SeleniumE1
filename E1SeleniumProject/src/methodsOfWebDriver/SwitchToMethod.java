package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://127.0.0.1/login.do");
       driver.switchTo().activeElement().sendKeys("Manager");
       Thread.sleep(2000);
       driver.quit();
	}

}
