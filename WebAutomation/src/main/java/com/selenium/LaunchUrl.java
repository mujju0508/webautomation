package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkingDirectory\\WebAutomation\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.browserstack.com");
System.out.println("URL launch browser stack");
System.out.println("added new line");

System.out.println("added new line by master");
System.out.println("added 3rd line by master");
driver.close();
System.out.println("URL closed");
	}

}
