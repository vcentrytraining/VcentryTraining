package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import init.InitBrowser;
import init.ReadProperty;

public class ValidateCheckout extends InitBrowser{
	
	
	@Test
	public void checkout() throws IOException {
		
		// Framework => Read, Reuse, maintain
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://djangovinoth.pythonanywhere.com/login/");*/
		
		// Login Page
		//driver.findElement(By.name("username")).sendKeys("user1");
		//driver.findElement(By.name("password")).sendKeys("Guru@12345");
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		// Home Page
		//driver.get("http://djangovinoth.pythonanywhere.com/labhome/");
		//driver.findElement(By.id("element44")).click();
		//driver.findElement(By.id("element45")).click();
		
		// Checkout Page
		/*driver.findElement(By.id("id0")).sendKeys("Prod A");
		driver.findElement(By.id("id1")).sendKeys("1234567");
		driver.findElement(By.id("id2")).sendKeys("mail@gmail.com");
		WebElement cat= driver.findElement(By.id("id3"));
		Select c = new Select(cat);
		c.selectByVisibleText("Electronics");
		driver.findElement(By.id("id4")).sendKeys("10");
		driver.findElement(By.id("id5")).sendKeys("Purchaser 1");
		driver.findElement(By.id("idyes")).click();
		driver.findElement(By.id("cod")).click();
		driver.findElement(By.id("order")).click();*/
		
		
		initBrowser();
		
		LoginPage.enterUsername(driver, ReadProperty.getProperty("USERNAME"));
		LoginPage.enterPassword(driver, ReadProperty.getProperty("PASSWORD"));
		LoginPage.clickLoginButton(driver);
		
		driver.get("http://djangovinoth.pythonanywhere.com/labhome/");
		
		HomePage.clickFrameworkFormsLink(driver);
		HomePage.clickSimpleFormLink(driver);
		
		CheckoutPage.enterProductName(driver, "Prod B");
		CheckoutPage.enterMobile(driver, "22222");
		CheckoutPage.enterEmail(driver, "mail@mail.com");
		CheckoutPage.selectProductCategory(driver, "Electronics");
		CheckoutPage.enterProductQuantity(driver, "22");
		CheckoutPage.enterPurchaserName(driver, "aaa");
		CheckoutPage.clickGstYesRadio(driver);
		CheckoutPage.checkCOD(driver);
		CheckoutPage.clickPlaceOrderButton(driver);
		
		
		
	}

}
