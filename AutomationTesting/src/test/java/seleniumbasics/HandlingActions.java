package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyMouseHover() {
	
		//WebElement home = driver.findElement(By.linkText("Home"));
		WebElement home1 = driver.findElement(By.xpath("//a[text() ='Home']"));
		//Create a object for inbuild class Action
		Actions act =  new Actions(driver);
		//act.moveToElement(home1) action to perform hover
		//build() to prepare the driver to perform the action.
		//perform()- to execute the action
		act.moveToElement(home1).build().perform();
		
	}
	public void verifyRightClick() {
		WebElement home = driver.findElement(By.xpath("//a[text() ='Home']"));
		Actions act =  new Actions(driver);
		act.contextClick(home).build().perform();
	}
	public void verifyDraganddrop() {
		 driver.navigate().to("https://demoqa.com/droppable");
		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement drop =driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions act =  new Actions(driver);
		 act.dragAndDrop(drag, drop).build().perform();
	}
	public void verifyKeyboardactions() throws AWTException {  
		Robot robot = new Robot();
		//VK - Virtual key. keypress simulates key press activity.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		//keyrelease to release the press of key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions handlingactions = new HandlingActions();
		handlingactions.browserInitialization();
	//	handlingactions.verifyMouseHover();
	//	handlingactions.verifyRightClick();
	//	handlingactions.verifyDraganddrop();
		try {
			handlingactions.verifyKeyboardactions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
