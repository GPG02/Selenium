package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("http://www.fb.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
	}

}
