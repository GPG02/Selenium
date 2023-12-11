package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample4.html");
		
		
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("admin123");
				
	}

}
