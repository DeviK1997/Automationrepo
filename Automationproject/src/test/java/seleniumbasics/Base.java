package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver; //webdriver declaration
	public void browserLaunch(){
	driver = new ChromeDriver(); //to call the browser
	driver.get("https://selenium.qabible.in/"); //to get the site
	driver.manage().window().maximize();//to maximize the window
	}
	
	public void browserClose() {
		driver.quit();
	}
	
	

	public static void main(String[] args) {
		Base base = new Base();
		base.browserLaunch();
		base.browserClose();
		// TODO Auto-generated method stub

	}

}
