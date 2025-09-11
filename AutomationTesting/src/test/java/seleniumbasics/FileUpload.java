package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	public void fileuploadusingsendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\Dell\\git\\Automation-Basics\\AutomationTesting\\src\\test\\resources\\Core_Java_Automation_QA.pdf");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		WebElement submitbutton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();
	}
	public void fileuploadusingkeyboard() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\Dell\\git\\Automation\\AutomationTesting\\src\\test\\resources\\Core_Java_Automation_QA.pdf");
		//enta string coppy pasteokecheyanam eenkil string selection class help cheyum athu
		//kondu anu string selection class use cheyune. 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//toolkit is a java awt provided class anu.caoacity-enthelum clipboardil copy cheyune stalam(intermediate )
		//system chlipboaril coppy aki vechu.
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		fileupload.browserInitialization();
		fileupload.fileuploadusingsendkeys();
//		try {
//			fileupload.fileuploadusingkeyboard();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
