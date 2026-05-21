package seleniumbasics;

public class NavigationCommandsAndBrowserCommandes extends Base {
	
	public void verifyNavigationCommand() {
		driver.navigate().to("https://www.amazon.in/"); //to navigate to another site
		driver.navigate().back();//back to prev site
		driver.navigate().forward();// navigate to amazon site again
		driver.navigate().refresh();//reload
	}
	
	public void verifyBrowserCommands() {
		String title = driver.getTitle(); //to fetch title of site
		System.out.println(title); //to print title in console
		String url = driver.getCurrentUrl();//to fetch url of site
		System.out.println(url);
		String handleid = driver.getWindowHandle();//to fetch id of window
		System.out.println(handleid);
		String source = driver.getPageSource();//to fetch sourcecode of a site
		System.out.println(source);
	}

	public static void main(String[] args) {
		NavigationCommandsAndBrowserCommandes navigate = new NavigationCommandsAndBrowserCommandes();
		navigate.browserLaunch();
		//navigate.verifyNavigationCommand();
		navigate.verifyBrowserCommands();
		// TODO Auto-generated method stub

	}

}
