package seleniumbasics;

public class BrowserCommands extends Base {
 public void broserCommands() {
	
	//String title = driver.getTitle();  //Stringil title assign cheyunu
	//System.out.println(title);
	// String url= driver.getCurrentUrl();
	// driver.getCurrentUrl();
	// System.out.println(url);
	String page = driver.getPageSource();
	 System.out.println(page);
	// System.out.println(driver.getTitle());
	// System.out.println(driver.getCurrentUrl());
//	 System.out.println(driver.getPageSource());
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands brosercommand = new BrowserCommands();
		brosercommand.browserInitialization();
		brosercommand.broserCommands();
		brosercommand.browserQuitClose();
		
	}

}
