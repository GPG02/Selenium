package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//get--> enter the url into addressbar of the browser & load the page
		driver.get("http://www.fb.com");
		
		//get the url present in the addressbar of the browser
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title=driver.getTitle();
		System.out.println(title);
		
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		
		driver.quit();
	}

}
