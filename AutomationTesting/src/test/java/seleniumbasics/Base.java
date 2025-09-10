package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{
	public WebDriver driver ;
	public void browserInitialization() {
		 driver = new ChromeDriver(); //webdriver interface chromedriver class driver ref variable
	driver.get( "https://selenium.qabible.in/");//to launge url use get method
		driver.manage().window().maximize();//maximize window
		//driver.close(); //to close the current window
		//driver.quit();// to close the complete window
	}
	public void browserQuitClose() {
	
		//driver.close();
		driver.quit();
	}
		
	
//	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//	Base base = new Base(); 
		
	}
	
