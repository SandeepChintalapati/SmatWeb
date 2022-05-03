package AdminModule.Smatweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Loginpageobjects {
	
	
	WebDriver driver;
	public Loginpageobjects(WebDriver driver)
	
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="P101_USERNAME")
	WebElement username;
	
	@FindBy(name="P101_PASSWORD")
	WebElement password;
	
	@FindBy(css="select#P101_GLOSSARY")
	WebElement Glossary;
	
	@FindBy(id="P101_DATA_NLS")
	WebElement dropdownwebelement ;
	
	@FindBy(css="button#P101_LOGIN")
	WebElement login ;
	
	
	public WebElement Username()
	{
		
		return username;
	}
	
	public WebElement Password()
	{
		
		return password;
	}
	
	
	public WebElement glossary()
	{
		
		return Glossary;
	}
	
	
	public WebElement DropdownWebelement()
	{
		
		return dropdownwebelement;
	}
	
	public WebElement Login()
	{
		
		return login;
	}
	

}
