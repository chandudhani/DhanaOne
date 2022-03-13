package com.dhana.news;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\DhanaSelenium\\New folder\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");// it HITS URL

	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	//ROWS
	WebElement TogetRows = driver.findElement(By.xpath("//table[@id='product']/tbody"));
	List<WebElement>TotalRowsList = TogetRows.findElements(By.tagName("tr"));
	//System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size()); 
	int x = TotalRowsList.size();
	System.out.println(x);
	
	//COLUMNS
	WebElement ToGetColumns = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+1+"]/td"));
	List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));
	System.out.println("Total Number of Columns in the table are: "+TotalColsList.size()); 
	

}
}
