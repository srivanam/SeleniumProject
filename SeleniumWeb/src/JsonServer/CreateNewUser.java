package JsonServer;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateNewUser {
	@Test()
	public void UserCreate() throws InterruptedException {
		
			
			File file= new File("Driver//chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://ec2-52-91-203-95.compute-1.amazonaws.com:8080/admin/users");
			Thread.sleep(1000);
			driver.findElement(By.linkText("Users"));
			Thread.sleep(2000);
			//driver.findElement(By.linkText("New User"));
			driver.findElement(By.xpath("//*[@id=\'titlebar_right\']/div/span/a")).click();
			driver.findElement(By.xpath("//input[@id='user_username']")).sendKeys("TTim1234");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Welcome@1234567");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id=\'user_email\']")).sendKeys("TTimtest1234567@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name=\'commit\']")).click();
			Thread.sleep(2000);
	        driver.findElement(By.linkText("Users")).click();
	        Thread.sleep(1000);
	        
	       driver.findElement(By.xpath("//*[@id='q_username_input']/select")).click();
	        
	        //select
	       WebElement dropdown=driver.findElement(By.xpath("//*[@id='q_username_input']/select"));
			Select select=new Select(dropdown);
			select.selectByVisibleText("Starts with");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='\"q_username\"=']")).sendKeys("TTim");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='q_email_input']/select")).click();
			Thread.sleep(1000);
			 WebElement dropdown1=driver.findElement(By.xpath("//*[@id='q_email_input']/select"));
				Select select1=new Select(dropdown1);
				select.selectByVisibleText("Starts with");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='q_email']")).sendKeys("Welcome@12345");
				
				//date
				driver.findElement(By.xpath("//input[@id='q_created_at_gteq_datetime']")).sendKeys("1/16/2019");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='commit']")).click();
				
	        
			
			//int framesize=driver.findElements(By.tagName("frame")).size();"
	}
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


