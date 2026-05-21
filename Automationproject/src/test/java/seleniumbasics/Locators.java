package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators() {
		driver.findElement(By.id("button-two"));//element locating
		driver.findElement(By.id("single-input-field"));//By is a predefined class for all locator methods
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));//for link - LinkText
		driver.findElement(By.partialLinkText("Simple Form "));//partial likedText
		driver.findElement(By.cssSelector("button[id='button-one']"));// syntax: tagname[attribute='attributevalue']
	//	/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button : absolute xpath(since its start route node,it there is any changes it may affect )
		driver.findElement(By.xpath("//button[@id='button-one']")); //  relative xpath - syntax: //tagname[@attribute='attributevalue']
		//Using text
		driver.findElement(By.xpath("//label[text()='Enter Message']"));//for text
		//for alignment issue,use like these:
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));//use contains method
		//if there is no text,id to specify elements exactly give two attributes like these
		driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
		//Using X-path_ access method_ Using Parent
		driver.findElement(By.xpath("//button[@id='button-one']//parent:://div[@class='card']"));
		//Using X-path_ access method_ Using Child
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		//Using X-path_ access method_ Using Following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));//preceeding
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div\""));
		driver.findElement(By.xpath("///div[@class='card']//descendant::div"));
	}

}
