package org.junit;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	public static WebDriver driver = null;
	@BeforeClass
	public static void browserLaunch() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenNewProject\\src\\Selenium\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
	}
	
@Before
public void startTime() {
	Date d = new Date(0);
	System.out.println(d);
}
@Test
public void login() {
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("senthilbaskaran@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("**********");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}
@After
public void endTime() {
	Date d = new Date(0);
	System.out.println(d);

}
@AfterClass
public static void quit() {
	driver.quit();
}

}