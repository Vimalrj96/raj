package org.Tecovas;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tecovas {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\eclipse-workspace\\TecovasSelenium\\drivers\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		Actions a = new Actions(driver);
//		try {
//			//Robot r = new Robot();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	//	JavascriptExecutor j = (JavascriptExecutor)driver;
		
		
		driver.get("https://www.tecovas.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement log = driver.findElement(By.xpath("//span[text()='login']"));
		log.click();
			
		WebElement mail = driver.findElement(By.xpath("(//input[@placeholder='you@email.com'])[1]"));
		mail.sendKeys("vimalraj720@gmail.com");
		
		WebElement pas = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pas.sendKeys("vimalrj6");
		
	 //  driver.findElement(By.xpath("(//button[contains(@class,'onetrust')])[1]")).click();
		
		WebElement sub = driver.findElement(By.xpath("(//button[text()='Submit'])[1]"));
		sub.click();
		
		WebElement men = driver.findElement(By.xpath("(//span[text()='Men'])[1]"));
		a.moveToElement(men).perform();
		WebElement hat = driver.findElement(By.xpath("(//a[text()='Hats'])[1]"));
		hat.click();

		driver.findElement(By.xpath("(//*[contains(text(),'Quality Made')])[3]")).click();
		
		//driver.findElement(By.xpath("(//button[contains(@class,'onetrust')])[1]")).click();
		
		//driver.findElement(By.xpath("//span[text()='Add To Cart']")).sendKeys(Keys.ENTER);
		//j.executeScript("arguments[0].click", cart );
		
	WebElement cart = driver.findElement(By.className("add-to-cart-text"));
	a.click(cart).perform();
		
	}
	
}
