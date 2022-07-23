package week2.day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DeleteLead  {

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
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					//Click on first resulting lead
					
					WebElement element = driver.findElement(By.xpath("//div[text()='Lead ID']/following::a[@class='linktext'][1]"));
					String num = element.getText();
					System.out.println(num);
					
					driver.findElement(By.xpath("//div[text()='Lead ID']/following::a[@class='linktext'][1]")).click();
					//Click Delete
					driver.findElement(By.xpath("//a[text()='Delete']")).click();
					//Click Find leads
					driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					//Enter captured lead ID
					driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[1]")).sendKeys(num);
					//Click find leads butto
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					//Verify message "No records to display"
					WebElement eleverify = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
					String text = eleverify.getText();
					System.out.println(text);
					if (text.contains("No records")){
						System.out.println("We have deleted the Leads sussfully");}
					else {
						System.out.println("Deletion unsussful");
					}
		
		}}
