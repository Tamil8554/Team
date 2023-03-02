package com.dropdown;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvaraj\\eclipse-workspace\\Dropdown\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("firstname")).sendKeys("TamilRaja");
	    driver.findElement(By.name("lastname")).sendKeys("Muthusamy");
	    driver.findElement(By.name("reg_email__")).sendKeys("9750318554");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("1234567");
	    WebElement day = driver.findElement(By.id("day"));
	    Select s=new Select(day);
	    s.selectByValue("25");
	    WebElement month = driver.findElement(By.id("month"));
	    Select q=new Select(month);
	    q.selectByValue("10");
	    WebElement year = driver.findElement(By.id("year"));
	    Select y=new Select(year);
	    y.selectByValue("1994");
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    
	    
	    
	    
	   
	
	
	
	}

}
