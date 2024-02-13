package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver abc = new EdgeDriver();
		abc.manage().window().maximize();
		abc.get("https://www.flipkart.com/");
		
		 abc.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']"));
		 abc.findElement(By.xpath("//button[@class='_2iLD__']")).click();

}}
