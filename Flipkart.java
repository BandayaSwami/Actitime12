package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[Class ='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Grocery']")).click();
		Thread.sleep(5000);
		driver.navigate().back();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Mobiles']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Appliances']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Travel']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Top Offers']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt = 'Two Wheelers']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
	}

}
