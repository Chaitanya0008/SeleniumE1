package HandalingPopups;

import java.awte.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopup {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.shoppersstack.com/");
        Thread.sleep(2000);

        // Creating JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        // Scrolling to the Swagger documentation link
        WebElement swaggerDocument = driver.findElement(By.xpath("//a[text()='Swagger documentation']"));
        js.executeScript("arguments[0].scrollIntoView(true);", swaggerDocument);
        
        
//        js.executeScript("window.scrollBy(0,4000);");
//        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()='Swagger documentation']")).click();
        Thread.sleep(2000);

        // Rest of your code
       robot = new Robot(driver);

//        robot.keyPress(KeyEvent.VKA);
//        robot. keyRelease(KeyEvent.VKA);
//        robot keyPress(KeyEvent.VXP);
//        robot. keyßelease(KeyEvent.VK_D);
//        robot.keyPress(KeyEvent.VK_M);
//        robot.keyRelease(KeyEvent.VK_M;
//        robot. keyPress(XeyEvent. VK_/);
//        robot,keyRelease（Key Event.IK.T）；
//        robot.keyPress(KeyEvent.vK_N);
//        robot. keyRelease(KeyEvent.VK_N);
//        robot. KeyPress (KeyEvent.V% TA3); robot.keyRelease(KeyEvent. VK_TAB);
}
}
