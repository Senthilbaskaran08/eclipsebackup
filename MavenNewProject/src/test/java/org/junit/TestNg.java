package org.junit;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNg {
	public static WebDriver driver = null;
	@BeforeSuite
	public static void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenNewProject\\src\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.adactin.com/HotelApp/");
	}
	
@BeforeClass
public static void startTime() {
	Date d = new Date(0);
	System.out.println(d);
}
@Test
public static void login() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Senthilbas");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9962400707");
	driver.findElement(By.xpath("//input[@name='login']")).click();
	
}
@AfterClass
public static void endTime() {
	Date d = new Date(0);
	System.out.println(d);

}
@AfterSuite
public static void quit() {
	driver.quit();
}
}
