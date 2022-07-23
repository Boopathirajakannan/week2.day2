package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we have to call WDM for the Browser driver
		WebDriverManager.chromedriver().setup();

		//Launch the browser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("https://erail.in");

		//Maxi the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='22101']/following::td[1]/a"));
		String name = element.getText();
		System.out.println(name);

	}

}
