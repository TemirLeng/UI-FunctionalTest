package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class Xpath {
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nurkulov\\Documents\\selenuim dependencies\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement one=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]"));
	WebElement two=driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input"));
	one.click();
	two.click();
	
	//verifyCheckBoxSelected(one);
	BrowserUtil.verifyCheckBoxSelected(one, two);
	StringBuilder n=new StringBuilder("Hello");
	StringBuilder n1=new StringBuilder("nizzzzzzzz");
	n.append(n1.replace(0,1, "jejejej").append("asdf"));
	System.out.println(n1);
	int i=1234567890;
	float f=i;
	int p=i-(int)f;
	System.out.println(p);
}


}
