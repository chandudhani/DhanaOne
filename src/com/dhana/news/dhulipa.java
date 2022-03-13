package com.dhana.news;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dhulipa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\DhanaSelenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com");// it HITS URL
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();
		
		//Sellect Destnation as Delhi
		driver.findElement(By.xpath("//a[@value=\"DEL\"]")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//a[@value=\"MAA\"])[2]")).click();
		//Sellect Destnation as Delhi
		driver.findElement(By.xpath(
				"//div[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR\"] //a[@value=\"MAA\"]"))
				.click();

		//driver.findElement(By.xpath("//div[@class=\"paxinfo\"]")).click();
		//Sellect date
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/table/tbody/tr[4]/td[2]/a")).click();           
		Thread.sleep(2000);
		driver.findElement(By.id("custom_date_picker_id_1r")).click();
		driver.findElement(By.xpath("//div[@id='custom_date_picker_id_1'])/parent:://table[@class='ui-datepicker-calendar']following-sibling::./a/contains(text(),'31')")).click();           
		Thread.sleep(2000L);
		
		for (int i = 1; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();// 4 times

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(3);

		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		driver.close();
	}

}