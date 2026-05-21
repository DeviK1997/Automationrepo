package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyWebCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php"); //first we have to navigate to next page
		WebElement msgbox =  driver.findElement(By.id("single-input-field"));//then locate element
		msgbox.sendKeys("Hello text");//to input text
		
		WebElement showmsgbutton =  driver.findElement(By.id("button-one"));
		showmsgbutton.click(); //to click element
		msgbox.clear();
		//to fetch the text
		WebElement message =  driver.findElement(By.id("message-one"));
		System.out.println(message.getText());//to fetch text 
		System.out.println(showmsgbutton.getTagName());//to fetch tagname - button
	}

	public static void main(String[] args) {
		WebElementCommands commands = new WebElementCommands();
		commands.browserLaunch();
		commands.verifyWebCommands();
	
		
		// TODO Auto-generated method stub

	}

}
