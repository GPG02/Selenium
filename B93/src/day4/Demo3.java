package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample3.html");
		
		WebElement e = driver.findElement(By.tagName("a"));

		e.click();
	}

}
