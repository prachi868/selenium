package seleniumdemos;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4jDemo {

	public static void main(String[] args) {
		      Logger log=Logger.getLogger(log4jDemo.class);
		      PropertyConfigurator.configure("log4j.properties");
		      
		  	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			log.info("Launch Browser");
			
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
			
			log.info("Opened application");
			
			String expectedtitle="Demo Web Shop. Login";
			String actualtitle=driver.getTitle();
			System.out.println(actualtitle);
			log.info("Title value is: "+actualtitle);
			if(expectedtitle.equals(actualtitle))
			{
				System.out.println("Titles match");
				log.info("Correct Title");
			   driver.findElement(By.id("Email")).sendKeys("Prachij12@gmail.com");
			   driver.findElement(By.name("Password")).sendKeys("prachi@23");
			   driver.findElement(By.xpath("//input[@value='Log in']")).click();
			   driver.findElement(By.linkText("Log out")).click();
			   driver.close();
			}
		      
			

	}

}
