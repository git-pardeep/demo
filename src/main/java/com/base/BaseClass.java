package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	public void launchBrowser(){
		System.out.println("hello ");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	public void launchURL() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("yatra");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(2000);
	}
}