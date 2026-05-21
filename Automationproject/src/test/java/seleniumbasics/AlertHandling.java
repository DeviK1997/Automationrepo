package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		
		Alert al = driver.switchTo().alert(); //transfering drivers control to popup window
		al.accept(); //to click ok in popup window
		//al.dismiss();//to click cancel in popup window
		
	}
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		
		Alert al1 = driver.switchTo().alert(); //transfering drivers control to popup window
		al1.accept(); 
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		
		Alert al2 = driver.switchTo().alert(); //transfering drivers control to popup window
		al2.sendKeys("promptalert");
		al2.accept(); 
	}
	
	public static void main(String[] args) {
		
		AlertHandling alert = new AlertHandling();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
		// TODO Auto-generated method stub

	}

}
