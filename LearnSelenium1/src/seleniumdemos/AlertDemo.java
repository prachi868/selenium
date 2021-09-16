package seleniumdemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert  alert=driver.switchTo().alert();
		String alertmessage= driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alert.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alertnew=driver.switchTo().alert();
		String alertmessagenew=driver.switchTo().alert().getText();
		System.out.println(alertmessagenew);
		alertnew.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alertn=driver.switchTo().alert();
		String alertmess=driver.switchTo().alert().getText();
		System.out.println(alertmess);
		alertn.sendKeys("tester");
		alertn.accept();
		
		
		
		

	}

}
