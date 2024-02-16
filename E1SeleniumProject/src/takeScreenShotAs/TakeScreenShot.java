package takeScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriver abc = new EdgeDriver();
		WebDriver abc = new ChromeDriver();
		abc.manage().window().maximize();
		//abc.manage().window().fullscreen();
		abc.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		abc.get("https://trello.com/b/dpjMIatR/cm");
        String getSourcecodeVarible = abc.getCurrentUrl();
        System.out.println(getSourcecodeVarible);
//		RemoteWebDriver rwd = (RemoteWebDriver)abc;
//		
//		File screenShot = rwd.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("./screenShot/trello.jpg");
//		Files.copy(screenShot, dest);
		
		

}
}
