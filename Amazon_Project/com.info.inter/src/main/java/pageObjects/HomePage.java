package pageObjects;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.openBrowser;

public class HomePage extends openBrowser{

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		openBrowser op = new openBrowser();
		WebDriver driver=op.open(args[0]);
		Thread.sleep(5000);
		textfield(driver);
		Thread.sleep(5000);
		clickBook(driver);
		Thread.sleep(5000);
		UpdatecartPage(driver);
	}
	
	// enter in the search box 
	static void textfield(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Ender's Game by Orson Scott Card");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
	}
	
	
	//selecting the book and adding to cart
	static void clickBook(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[contains(., 'Game (The Ender Quintet)')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Cart')]")).click();
	}
	
	//Selecting Cart and Updating cart
	static void UpdatecartPage(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Cart')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
}
