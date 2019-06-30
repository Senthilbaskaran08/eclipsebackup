package org.execution;

import org.maven.MavenNewProject.CommonMethod;
import org.pagefactory.fblogin.FacebookLogin;
import org.xml.sax.Locator;

public class FacebookExecution extends CommonMethod{
	public static void login() throws InterruptedException {
		CommonMethod.browserLauchChrome();
		CommonMethod.loadUrl("https://www.facebook.com/");
		FacebookLogin locator = new FacebookLogin();
		CommonMethod.type(locator.getUsername(), "bsenthil30@gmail.com");
		CommonMethod.type(locator.getPassword(), "sengi1234567");
		Thread.sleep(3000);
		CommonMethod.btClick(locator.getLogin());
	}
public static void main(String[] args) throws InterruptedException {
	login();
}
}
