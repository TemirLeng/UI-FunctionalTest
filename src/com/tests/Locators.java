package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nurkulov\\Documents\\selenuim dependencies\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("lalalala");
	driver.findElement(By.id("pass")).sendKeys("aaaaa");
//	driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click())
	driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
//	driver.findElement(By.id("loginbutton")).click();;
//	driver.findElement(By.id("u_0_a")).click();;
//	WebElement login1=driver.findElement(By.id("u_0_a"));
//	login1.click();
//	driver.navigate().back();
//	
	
	}
}
