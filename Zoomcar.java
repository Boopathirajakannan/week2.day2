package week2.day2;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Zoomcar {
	
		public static void main(String[] args) {
			//we have to call WDM for the Browser driver
			WebDriverManager.chromedriver().setup();

			//Launch the browser
			ChromeDriver driver = new ChromeDriver();

			//Load the URL
			driver.get("https://www.zoomcar.com/in/bangalore");

			//Maxi the browser
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//div[contains(text(),'Airport')]")).click();
			
			

		}}
