package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo1 {

	//automation script
	public static void script1(ChromeDriver driver)
	{
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	public static void script1(FirefoxDriver driver)
	{
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	public static void script1(EdgeDriver driver)
	{
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	public static void main(String[] args) {
		
		//calling the script
		ChromeDriver surendra=new ChromeDriver();
		Demo1.script1(surendra);
		
		FirefoxDriver ashwini=new FirefoxDriver();
		Demo1.script1(ashwini);
		
		EdgeDriver akash=new EdgeDriver();
		Demo1.script1(akash);
	}

}
