package org.maven.MavenNewProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethod {
public static WebDriver driver = null;
public static WebDriver browserLauchChrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\MavenNewProject\\src\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	
}
public static void btClick(WebElement element) {
element.click();
}
public static void type(WebElement element, String data) {
element.sendKeys(data);
}
public static void loadUrl(String url) {
	driver.get(url);
}
}
