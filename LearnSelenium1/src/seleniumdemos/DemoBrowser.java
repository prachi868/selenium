package seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://chrome://newtab");
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		int titleLength=title.length();
		System.out.println(titleLength);
		/*String currentURL=driver.getCurrentUrl();
	String expectedURL="http://demowebshop.tricentis.com";
	   if(currentURL.equals(expectedURL)) {
		System.out.println("Correct page opened");
	}*/
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		int PageSourceLength=PageSource.length();
		System.out.println(PageSourceLength);
		driver.close();
		
		

	}

}
