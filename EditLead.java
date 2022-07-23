package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//call WDM 
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maxi the Browser
				driver.manage().window().maximize();
				//find the user name and enter "demosalesmanager"
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");

				//find the password and enter "crmsfa"
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

				//click on the login element and click
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				//Click crm/sfa link
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				//Click Leads link
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//click on find leads
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				//Enter first name
				driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input[1]")).sendKeys("Boopathi");
				//Click Find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//Click on first resulting lead
				driver.findElement(By.xpath("//div[text()='Lead ID']/following::a[@class='linktext'][1]")).click();

				//Verify title of the page
				System.out.println("The Title is:" +driver.getTitle());
			    	
			    //Click Edit
			    driver.findElement(By.xpath("//a[text()='Edit']")).click();
			    //Change the company name
			    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Facebook");
			    
			    //Click Update
			    driver.findElement(By.xpath("//input[@value='Update']")).click();
			    //Confirm the changed name appears
			    WebElement element = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
			    System.out.println(element.getText()); 
			    //Close the browser
				driver.close();
			    }		
	}


