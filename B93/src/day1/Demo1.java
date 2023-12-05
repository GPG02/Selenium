package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Jai Ganesha");
		//java -> creating ChromeDriver class Object
		//Selenium--> Open the chrome browser
		ChromeDriver c=new ChromeDriver();//open the browser
		c.get("http://www.google.com");//enter the url 
		c.close();//close the browser
	}

}
