package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	public void verifyFrames() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe")); //since there are more frames we have to use list and findelements
		System.out.println(totalframe.size());
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);//switching the frame
		WebElement frameheading = driver.findElement(By.id("sampleHeading"));
		System.out.println(frameheading.getText());
		//driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		HandlingFrames hf = new HandlingFrames();
		
		hf.browserLaunch();
		hf.verifyFrames();
		
		// TODO Auto-generated method stub

	}

}
