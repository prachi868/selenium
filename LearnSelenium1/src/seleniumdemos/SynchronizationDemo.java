package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		   driver.findElement(By.id("Email")).sendKeys("Prachij12@gmail.com");
		   driver.findElement(By.name("Password")).sendKeys("prachi@23");
		   driver.findElement(By.xpath("//input[@value='Log in']")).click();
		   WebDriverWait MyWait=new WebDriverWait(driver,10);
		   MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
		   driver.findElement(By.linkText("Log out")).click();
		   driver.close();

	}


}
