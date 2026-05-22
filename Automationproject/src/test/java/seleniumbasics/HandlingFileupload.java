package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileupload extends Base {
	
	
	public void fileUploadUsingsendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement file = driver.findElement(By.id("uploadfile_0"));
		file.sendKeys("C:\\Users\\ACER\\git\\Automationrepo\\Automationproject\\src\\test\\resources\\419f567c-73b2-444e-b3ad-5cd03690add3.pdf");
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void fileUploadUsingRobotclass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement sub = driver.findElement(By.id("pickfiles"));
		sub.click();
		//copy and paste to clip board
		StringSelection selection = new StringSelection("C:\\Users\\ACER\\git\\Automationrepo\\Automationproject\\src\\test\\resources\\419f567c-73b2-444e-b3ad-5cd03690add3.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
	public static void main(String[] args)  {
	
	
	
	HandlingFileupload fileupload = new HandlingFileupload();
	fileupload.browserLaunch();
	//fileupload.fileUploadUsingsendkeys();
	try {
		fileupload.fileUploadUsingRobotclass();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		// TODO Auto-generated method stub

	}

}
