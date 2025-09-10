package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {
public void tagAndId() {   //tag#idattibutevalue
	WebElement tagid1 = driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagid2 = driver.findElement(By.cssSelector("button#button-two"));
	WebElement tagid3 = driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagid4 = driver.findElement(By.cssSelector("input#value-a"));
	
	
}
public void tagAndClass() {//tag.attibutevalue
	WebElement tagclass = driver.findElement(By.cssSelector("section.clearfix"));
	
	
}
public void tagAndAttribute() {//tagname[attribute='value']
	WebElement tag4 = driver.findElement(By.cssSelector("button[id='downloadButton']"));
	
}
public void tagClassAndAttribute() {//tagname.classname[attribute='value']
	WebElement tag5 =driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	WebElement tag6 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
