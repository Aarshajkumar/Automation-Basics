package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base {
	
public void relativeXpath() { //tagname[@attribute = 'value']
	WebElement relative1 = driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement relative2 = driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relative3 = driver.findElement(By.xpath("//input[@id='value-b']"));
	WebElement relative4 = driver.findElement(By.xpath("//button[@id='button-two']"));
	
}
public void text() {  //tagname[text() ='value'] here we are giving the text value
	WebElement text1 =driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement text2 =driver.findElement(By.xpath("//button[text()='Start Download']"));
	WebElement text3 = driver.findElement(By.xpath("//button[text()='Get Total']"));
	
	
}
public void contains() { //tagname[contains(@attribute,'value')]
	WebElement contains1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	WebElement contains3 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	WebElement contains4 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
}
public void startsWith() {  //tagname[starts-with(@attribute,'value')]
	WebElement startswith1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
	WebElement startswith2 = driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
	WebElement startswith3 = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
	WebElement startswith4 = driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
	
}
public void and() {  //tagname[@attribute='value'and @attribute='value']
	WebElement and1 = driver.findElement(By.xpath("//input[@id='single-input-field'and @class='form-control']"));
	WebElement and2 = driver.findElement(By.xpath("//button[@id='button-one'and @class='btn btn-primary']"));
	WebElement and3 = driver.findElement(By.xpath("//input[@id='value-a'and@class='form-control']"));
	WebElement and4 = driver.findElement(By.xpath("//input[@id='value-b'and@class='form-control']"));
}
public void or() {  //tagname[@attribute='value'or @attribute='value']
	WebElement or1 = driver.findElement(By.xpath("input[@class='form-control'or @id='value-a']"));
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
