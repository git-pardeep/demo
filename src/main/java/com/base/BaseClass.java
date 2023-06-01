package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	public void launchBrowser(){
		System.out.println("hello ");
		if (System.getProperty("Browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (System.getProperty("Browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if (System.getProperty("Browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		else {
			System.out.println("enter valid browser name");
		}
	}
	public void launchURL() throws InterruptedException {
		driver.get(System.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("yatra");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(2000);
	}
}