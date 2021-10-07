package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	public static void enterProductName(WebDriver driver, String pname) {
		driver.findElement(By.id("id0")).sendKeys(pname);
	}

	public static void enterMobile(WebDriver driver, String mno) {
		driver.findElement(By.id("id1")).sendKeys(mno);
	}

	public static void enterEmail(WebDriver driver, String email) {
		driver.findElement(By.id("id2")).sendKeys(email);
	}

	public static void selectProductCategory(WebDriver driver, String category) {
		WebElement cat= driver.findElement(By.id("id3"));
		Select c = new Select(cat);
		c.selectByVisibleText(category);
	}

	public static void enterProductQuantity(WebDriver driver, String qty) {
		driver.findElement(By.id("id4")).sendKeys(qty);
	}

	public static void enterPurchaserName(WebDriver driver, String name) {
		driver.findElement(By.id("id5")).sendKeys(name);
	}
	
	public static void clickGstYesRadio(WebDriver driver) {
		driver.findElement(By.id("idyes")).click();
	}
	
	public static void checkCOD(WebDriver driver) {
		driver.findElement(By.id("cod")).click();
	}
	
	public static void clickPlaceOrderButton(WebDriver driver) {
		driver.findElement(By.id("order")).click();
	}
	
	

}
