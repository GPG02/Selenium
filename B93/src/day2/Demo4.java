package day2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//diff options to enter url in selenium
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().to(new URL("http://www.gmail.com"));
		
	}

}
