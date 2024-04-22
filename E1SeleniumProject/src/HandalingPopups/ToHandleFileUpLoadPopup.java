package HandalingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUpLoadPopup {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		
		WebElement fileButtion = driver.findElement(By.id("myFile"));
		// TODO Auto-generated method stub
		Actions act = new Actions(driver);
		act.click(fileButtion).perform();
		
		Runtime.getRuntime().exec("./autoItProgrames/w3cschool.exe");

	}

}
