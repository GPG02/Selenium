package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) {
		//Open the browser
		FirefoxDriver driver=new FirefoxDriver();
		//Enter the URL
		driver.get("http://www.google.com");
		//print the title of the page
		System.out.println(driver.getTitle());
		//close the browser
		driver.quit();

	}

}
