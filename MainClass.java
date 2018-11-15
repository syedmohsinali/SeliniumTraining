package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
//Taask1--- Contact Us Form
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://demo.opencart.com/index.php?route=information/contact");
		driver2.manage().window().maximize();
		
		// Name
		WebElement Name;
		Name = driver2.findElement(By.id("input-name"));
		Name.sendKeys("Syed Mohsin Ali");
		
		//Email
		WebElement Email;
		Email = driver2.findElement(By.id("input-email"));
		Email.sendKeys("abc@gmail.com");
		
		//Enquiry
		WebElement Enquiry;
		Enquiry = driver2.findElement(By.id("input-enquiry"));
		Enquiry.sendKeys("Test Enquiry Message");
		
		//Submit
		WebElement SubmitBtn;
		SubmitBtn = driver2.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input"));
		SubmitBtn.click();
		
//Task 1--- Validate URL		
		String actualurl = driver2.getCurrentUrl();
		String expectedurl = "https://demo.opencart.com/index.php?route=information/contact/success";
		 
		 if (actualurl.contentEquals(expectedurl)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
		
		driver2.close();
		driver2.quit();
		
//Task 3--- Registration Form
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		// Input Firstname
		WebElement Firstname;
		Firstname = driver.findElement(By.id("input-firstname"));
		Firstname.sendKeys("Syed Mohsin");
		
		// Input Lastname
		WebElement Lastname;
		Lastname = driver.findElement(By.id("input-lastname"));
		Lastname.sendKeys("Ali");
		
		// Input Email
		WebElement Emails;
		Emails = driver.findElement(By.id("input-email"));
		Emails.sendKeys("syedmohsinali076@gmail.com");
		
		// Input Telephone
		WebElement Telephone;
		Telephone = driver.findElement(By.id("input-telephone"));
		Telephone.sendKeys("03462482724");
		
		// Input Password
		WebElement Password;
		Password = driver.findElement(By.id("input-password"));
		Password.sendKeys("1234567");
		
		// Input ConfirmPassword
		WebElement ConPassword;
		ConPassword = driver.findElement(By.id("input-confirm"));
		ConPassword.sendKeys("1234567");
		
		// Check box
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
		
		// ContinueButton
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
	
		
		
		String actualpagetitle = driver.getTitle();
		 String expectedTitle = "Warning";
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } 
		 else
	        {  
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			driver.manage().window().maximize();
//Task 3--- Login Form		
	        	
		// Input UserName
		WebElement username;
		username =driver.findElement(By.id("input-email"));
		username.sendKeys("mytc5@gmail.com");
		
		// Input Password
		WebElement Loginpassword;
		Loginpassword= driver.findElement(By.id("input-password"));
		Loginpassword.sendKeys("123456789");
		
		// Login Button
		WebElement Button;
		Button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		Button.click();

	       }
		driver.close();		
		
		driver.quit();
		  
		
	}

}
