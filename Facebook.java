package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//call WDM 
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//load the URL
				driver.get("https://en-gb.facebook.com/");
				//Maxi the Browser
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//Click on Create New Account button
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				//Enter the first name
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Boopathi");
				//Enter the last name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raja");
				//Enter the mobile number
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("801586698");
				//Enterthe password
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("raja80158");
				//Handle all the three drop downs
				driver.findElement(By.xpath("//select[@name='birthday_day']/option[@value='13']")).click();
				driver.findElement(By.xpath("//select[@title='Month']/option[text()='Mar']")).click();
				driver.findElement(By.xpath("//select[@title='Year']/option[text()='1995']")).click();
				//Select the radio button "Male
				driver.findElement(By.xpath("//label[text()='Male']/following::input[1]")).click();
				
}}

