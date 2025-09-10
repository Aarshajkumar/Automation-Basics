package seleniumbasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class HandlingFrames extends Base{
public void verifyFrames() {
	driver.navigate().to("https://demoqa.com/frames");
	//onil kooduthal iFrames ondu athukondu anu list cheyune.find elements kodukunathum athukodu anu 
	List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
	System.out.println(totalframes.size());
//	driver.switchTo().frame(1);//driver control vere oru point kodukan vendi anu switchto method use cheyune
//	driver.switchTo().frame("frame1");
//	driver.switchTo().parentFrame();
	WebElement frameelement = driver.findElement(By.xpath("//iFrame[@id='frame1']"));
	driver.switchTo().frame(frameelement);
	WebElement heading = driver.findElement(By.xpath("//h1[text()='This is a sample page' and @id='sampleHeading']"));
	System.out.println(heading.getText());
	driver.switchTo().defaultContent();//to get back the drivercontrol
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames handlingframes = new HandlingFrames();
		handlingframes.browserInitialization();
		handlingframes.verifyFrames();
	}

}
