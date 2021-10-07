package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public static void clickFrameworkFormsLink(WebDriver driver) {
		driver.findElement(By.id("element44")).click();
	}
	
	public static void clickSimpleFormLink(WebDriver driver) {
		driver.findElement(By.id("element45")).click();
	}

}
