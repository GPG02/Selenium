package day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		//enter the user name
		WebElement unTB = driver.switchTo().activeElement();
		unTB.sendKeys("Admin");
		Thread.sleep(1000);
		unTB.sendKeys(Keys.TAB);
		//enter the password
		WebElement pwTB = driver.switchTo().activeElement();
		pwTB.sendKeys("admin123");
		Thread.sleep(1000);
		
		//click on login
		pwTB.sendKeys(Keys.ENTER);
	}

}
