package pageObjectModel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage2 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usrname;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement psswd;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']/child::h6")
	private WebElement verify_homepages;
	
	@FindBy(xpath="//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")
	private WebElement drop_down;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logt_button;
	
	public RegisterPage2(WebDriver d1) {
		this.driver=d1;
		PageFactory.initElements(d1,this);
	}



	public void setUsrname(String uname) {
		
		usrname.sendKeys(uname);
	}



	public void setPsswd(String pwsd) {
		
	psswd.sendKeys(pwsd);
	}



	public void setLoginbtn() {
		loginbtn.click();
	}



	public void setVerify_homepages() {
		verify_homepages.isDisplayed();
	}



	public void setDrop_down() {
		 drop_down.click();
	}



	public void setLogt_button() {
		Actions ac=new Actions(driver);
		ac.moveToElement(logt_button).click();
		
	}
	
	

}
