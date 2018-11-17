package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderPlace {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbstudent\\Downloads\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();

	//Login		
        	
	// Input UserName
	WebElement username;
	username =driver.findElement(By.id("input-email"));
	username.clear();
	username.sendKeys("mytc5@gmail.com");
	
	// Input Password
	WebElement Loginpassword;
	Loginpassword= driver.findElement(By.id("input-password"));
	Loginpassword.sendKeys("123456789");
	
	// Login Button
	WebElement Button;
	Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	Button.click();
	
	driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP");
	
	WebElement AddtoCardBtn;
	AddtoCardBtn = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
	AddtoCardBtn.click();
	
	WebElement Checkout;
	Checkout = driver.findElement(By.id("//*[@id=\"cart\"]/button"));
	Checkout.click();
	
	

	}

}
