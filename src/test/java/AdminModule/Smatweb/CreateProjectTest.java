package AdminModule.Smatweb;

import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateProjectTest {
	@Test
	public void CreateProject() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in-srddb.ingrnet.com:8443/apex/sdb123/f?p=101:LOGIN");

		// css selector=tagname[attr='value'], Xpath –• //Tagname[@attribute=’value’]//

		driver.findElement(By.id("P101_USERNAME")).sendKeys("SPRDSDB");
		driver.findElement(By.name("P101_PASSWORD")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("select#P101_GLOSSARY")).click();

		Select NLSdropdown = new Select(driver.findElement(By.id("P101_DATA_NLS")));
		NLSdropdown.selectByVisibleText("English");

		driver.findElement(By.cssSelector("button#P101_LOGIN")).click();
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("//h3[text()='Administration']")).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath("//h3[normalize-space()='Global Setup']")).click();
		driver.findElement(By.xpath("//span[text()='Project Management']")).click();
		// int siz=driver.findElements(By.tagName("iframe")).size();
		// System.out.println(siz);

		driver.findElement(By.xpath("//button[@data-action='create-new-project']")).click();
		// int siz1=driver.findElements(By.tagName("iframe")).size();
		// System.out.println(siz1);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("P400560_PROJECT")).sendKeys("SSCPROJ");
		driver.findElement(By.cssSelector("button[lov-modal-page='400565']")).click();
		driver.switchTo().defaultContent();
		// int siz2=driver.findElements(By.tagName("iframe")).size();
		// System.out.println(siz2);
		driver.findElement(By.xpath(
				"//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog--apex t-Dialog-page--standard ui-draggable ui-resizable']"))
				.click();
		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//tr[@data-id='0']/td/a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("button[lov-modal-page='400561']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(
				"//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front ui-dialog--apex t-Dialog-page--standard ui-draggable ui-resizable']"))
				.click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//tr[@data-id='8']/td/a")).click();
		driver.close();
		
		System.out.println("Extra line in create project");
		/*
		 * driver.findElement(By.cssSelector("button[lov-modal-page='400564']")).click()
		 * ; driver.findElement(By.xpath("//tr[@data-id='1']/td/a")).click();
		 * driver.findElement(By.cssSelector("button[lov-modal-page='400562']")).click()
		 * ; driver.findElement(By.xpath("//tr[@data-id='9']/td/a")).click();
		 */

	}

}
