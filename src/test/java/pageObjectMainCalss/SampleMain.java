package pageObjectMainCalss;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel1.LoginPaged;
import pageObjectModel2.RegisterPage2;

public class SampleMain {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void open_browser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	@Test(priority = 1)
	public void main_method() {

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		LoginPaged lp=new LoginPaged(driver);
	lp.enter_uname_pass("Admin", "admin123");
		lp.click_button();
		lp.verifu_homepage();
		lp.logout_button();
	
		
	}
	
	@Test(priority = 2)
	public void main_method2() {

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		RegisterPage2 rp=new RegisterPage2(driver);
		rp.setUsrname("Admin");
		rp.setPsswd("admin123");
		rp.setLoginbtn();
		rp.setVerify_homepages();
		rp.setLogt_button();
		
	}

}
