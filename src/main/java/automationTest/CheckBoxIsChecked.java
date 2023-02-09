package automationTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxIsChecked {
WebDriver driver;
	
	
	public int generateRandomNum(int boundryNum) {
	
		Random rnd = new Random();
		int generatedNum=rnd.nextInt(boundryNum);
		return generatedNum;
		
	}
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
		
		driver.findElement(By.name("data")).sendKeys("TechfiosTestPrakash"+ generateRandomNum(999));
		driver.findElement(By.xpath("/html/body/div[4]/input[2]")).click();
		driver.findElement(By.name("allbox")).click();
	}

}
