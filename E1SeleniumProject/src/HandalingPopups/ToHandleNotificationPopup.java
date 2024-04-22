package HandalingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ToHandleNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions eg = new EdgeOptions();
		
		//eg.addArguments("--diseble-notifications");
       WebDriver driver = new EdgeDriver(eg);
      
		driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("www.easemytrip.com");
        //Thread.sleep(5000);
        

	}

}
