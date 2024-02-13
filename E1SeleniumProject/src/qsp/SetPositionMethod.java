package qsp;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPositionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		//Thread.sleep(5000);
		//  abc.manage().window().maximize();
		Thread.sleep(5000);
		Point targetPoint = new Point(200, 300);
		
		abc.manage().window().setPosition(targetPoint);
		
	}

}