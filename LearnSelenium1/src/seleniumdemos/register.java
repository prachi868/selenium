package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("prachii");
		driver.findElement(By.id("LastName")).sendKeys("Jainn");
		driver.findElement(By.id("Email")).sendKeys("prachi54@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("prachi145");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("prachi145");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();

	}
}
