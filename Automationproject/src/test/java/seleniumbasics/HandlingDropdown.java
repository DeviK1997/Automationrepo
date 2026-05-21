package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	
public void verifyDropdown() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement drop = driver.findElement(By.id("dropdowm-menu-1"));
	//creating object for predefined class - Select
	Select select = new Select(drop);
	//select.selectByIndex(1);
	//select.selectByValue("java");
	//select.selectByVisibleText("SQL");
	
}

public void verifyCheckbox() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement check = driver.findElement(By.xpath("//input(@value='option-2']"));
	check.click();
}
public void verifyRadioButton() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radio = driver.findElement(By.xpath("//input[@value='yellow']"));
	radio.click();
}
	public static void main(String[] args) {
		HandlingDropdown dropdown = new HandlingDropdown();
		dropdown.browserLaunch();
		//dropdown.verifyDropdown();
		//dropdown.verifyCheckbox();
		dropdown.verifyRadioButton();
		
		// TODO Auto-generated method stub

	}

}
