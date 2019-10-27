package com.tests;

import org.openqa.selenium.WebElement;

public class BrowserUtil {
	public static void verifyCheckBoxSelected(WebElement one, WebElement two) {
		if(!one.isSelected()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		if(two.isSelected()) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
