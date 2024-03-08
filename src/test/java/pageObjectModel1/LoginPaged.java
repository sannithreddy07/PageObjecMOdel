package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPaged {
	
	public WebDriver driver;
	
	By txuname=By.xpath("//input[@name='username']");
	By txpass=By.xpath("//input[@name='password']");
	By submit_button=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	By verify=By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/child::h6");
	By log_dropdon=By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]");
	By logout=By.xpath("//a[text()='Logout']");
	
	public LoginPaged(WebDriver d) {
		this.driver=d;
	}
	
	public void enter_uname_pass(String uname, String pwd) {
		driver.findElement(txuname).sendKeys(uname);
		driver.findElement(txpass).sendKeys(pwd);
	}
	public void click_button() {
		driver.findElement(submit_button).click();
	}
	public void verifu_homepage() {
		driver.findElement(verify).isDisplayed();
	}
	public void logout_button() {
		driver.findElement(log_dropdon).click();
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(logout)).click();
	}
	

	

}
