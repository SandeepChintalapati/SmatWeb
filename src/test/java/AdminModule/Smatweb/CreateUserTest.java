package AdminModule.Smatweb;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateUserTest {
	@Parameters({"APEX URL"})
	@Test
	public void CreateUser(String url) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get(url);

		// css selector=tagname[attr='value'], Xpath –• //Tagname[@attribute=’value’]//
		
		Loginpageobjects loginpage=new Loginpageobjects(driver);

		loginpage.Username().sendKeys("SPRDSDB");
		loginpage.Password().sendKeys("Admin@123");
		loginpage.glossary().click();

		Select NLSdropdown = new Select(loginpage.DropdownWebelement());
		NLSdropdown.selectByVisibleText("Industry");

		loginpage.Login().click();

		Thread.sleep(15000);
		driver.findElement(By.xpath("//h3[text()='Administration']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//h3[normalize-space()='Global Setup']")).click();
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		driver.findElement(By.xpath("//button[@id='REG_USR_ig_toolbar_BT_CU']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[contains(@id,'P400160_USER_ID')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'P400160_USER_ID')]")).sendKeys("SSCHINTA1");
		driver.findElement(By.name("P400160_PASSWORD")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("input#P400160_FIRST_NAME")).sendKeys("Sandeep");
		driver.findElement(By.xpath("//input[@id='P400160_LAST_NAME']")).sendKeys("Chintalapati");
		driver.findElement(By.id("P400160_TELEPHONE")).sendKeys("9848022338");
		driver.findElement(By.name("P400160_COMPANY")).sendKeys("Hexagon");
		driver.findElement(By.cssSelector("input#P400160_DEPARTMENT")).sendKeys("Quality");
		Actions a = new Actions(driver);
		/*
		 * a.moveToElement(driver.findElement(By.id("P400160_TELEPHONE"))).contextClick(
		 * ).build().perform();
		 */

		//driver.findElement(By.xpath("//button[@id='CREATE_USER']")).click();

	

	}

}
