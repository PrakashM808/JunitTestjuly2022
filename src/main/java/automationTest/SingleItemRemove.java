package automationTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleItemRemove {
	
	WebDriver driver;
	
	
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void CheckBoxTest() {
		driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
	}

}
