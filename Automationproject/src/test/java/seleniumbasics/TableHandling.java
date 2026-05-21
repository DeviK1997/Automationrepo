package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void verifyTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		//WebElement table = driver.findElement(By.id("dataTable"));
		//System.out.println(table.getText()); // to get table in console
		WebElement table1 = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]")); //to get 2nd row of table
		System.out.println(table1.getText());
	}

	public static void main(String[] args) {
		TableHandling th = new TableHandling();
		th.browserLaunch();
		th.verifyTable();
		// TODO Auto-generated method stub

	}

}
