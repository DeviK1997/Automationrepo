package seleniumbasics;

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

	public static void main(String[] args) {
		HandlingAction act = new HandlingAction();
		act.browserLaunch();
		//act.verifyMouseOver();
		//act.verifyRightClick();
		act.verifyDragAnddrop();
		// TODO Auto-generated method stub

	}

}
