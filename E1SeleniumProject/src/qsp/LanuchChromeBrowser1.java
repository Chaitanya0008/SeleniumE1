package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver abc = new EdgeDriver();
		Thread.sleep(5000);
		abc.manage().window().maximize();
		Thread.sleep(5000);
		new Dimension(400, 500);
		System.out.println("0008");
		
	
		
		
	}

}
