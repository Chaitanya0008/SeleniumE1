package DataDrivenFrameWork;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do");
		

	}

}
