package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingAction extends Base {
	
	public void verifyMouseOver() {
		WebElement mouse = driver.findElement(By.id("others"));
		Actions action = new Actions(driver); //predefined class
		action.moveToElement(mouse).build().perform();//to execute the action we have to mandatory call - built and perform
		
	}
	public void verifyRightClick() {
		WebElement rightclick = driver.findElement(By.id("others"));
		Actions action = new Actions(driver); //predefined class
		action.contextClick(rightclick).build().perform();//to execute the action we have to mandatory call - built and perform
		
	}
	public void verifyDragAnddrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver); //predefined class
		action.dragAndDrop(drag, drop).build().perform();//to execute the action we have to mandatory call - built and perform
		
	}
	
	public void verifyKeyboardAction() throws Throwable {
		Robot robot = new Robot();
		//TO PRESS CONTROL T
		robot.keyPress(KeyEvent.VK_CONTROL);//HERE WE HAVE TO PRESS CONTROL
		robot.keyPress(KeyEvent.VK_T);//TO PRESS T
		//TO RELEASE KEYS
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		HandlingAction act = new HandlingAction();
		act.browserLaunch();
		//act.verifyMouseOver();
		//act.verifyRightClick();
		//act.verifyDragAnddrop();
		try {
			act.verifyKeyboardAction();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
