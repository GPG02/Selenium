package day3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//how do u copy paste value from one textbox to another
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement unTB = driver.switchTo().activeElement();
		unTB.sendKeys("Admin");
		Thread.sleep(2000);
		unTB.sendKeys(Keys.SHIFT,Keys.ARROW_LEFT,Keys.ARROW_LEFT);
		unTB.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		unTB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement pwTB = driver.switchTo().activeElement();
		pwTB.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();
	}

}
