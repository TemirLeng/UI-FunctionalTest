package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEtsy {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nurkulov\\Documents\\selenuim dependencies\\drivers\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://etsy.com");
//	driver.findElement(By.linkText("Etsy, Inc.")).click();
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://the-internet.herokuapp.com/checkboxes");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
}

}
