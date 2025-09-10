package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	//WebElement elementname = driver.findElement(By.locator("value"));
public void id() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement message = driver.findElement(By.id("single-input-field"));
	message.sendKeys("Aarathy");
	WebElement button =driver.findElement(By.id("button-one"));
	button.click();
	

	WebElement valueA = driver.findElement(By.id("value-a"));
	valueA.sendKeys("50");
	WebElement valueB = driver.findElement(By.id("value-b"));
	valueB.sendKeys("50");
	WebElement total = driver.findElement(By.id("button-two"));
	total.click();
	
	
	
//	WebElement firstname1 = driver.findElement(By.id("firstName"));
//	WebElement lastname1 = driver.findElement(By.id("lastName"));
//	WebElement Resumenow = driver.findElement(By.id("widget-user-email"));
//	WebElement Facebook = driver.findElement(By.id("u_0_8_EO"));
	
	//WebElement button =driver.findElement(By.id("button-one"));
//button.click();


	
}
public void name() {
	//WebElement name1 = driver.findElement(By.name("firstname"));
//	WebElement name2 = driver.findElement(By.name("lastname"));
//	WebElement name3 = driver.findElement(By.name("WebElement name2 "));
//	WebElement name4 = driver.findElement(By.name("reg_passwd__"));
}
public void className() {
	
}


public void linkText() {
	WebElement link = driver.findElement(By.linkText("Radio Buttons Demo"));
}
public void partialLink() {
	WebElement partial = driver.findElement(By.partialLinkText("Simple Form D"));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators locators =new Locators();
		locators.browserInitialization();
		locators.id();
	 
		
	//	locators.browserQuitClose();
		
	}

}
