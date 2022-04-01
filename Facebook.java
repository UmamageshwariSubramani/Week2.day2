package Week1.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub\
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://en-gb.facebook.com/");
		
	    driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("firstname")).sendKeys("Kani");
	    driver.findElement(By.name("lastname")).sendKeys("amudhan");
	    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("925265987");
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("karmugilen");
	    WebElement dayele = driver.findElement(By.name("birthday_day"));
	    WebElement monthele = driver.findElement(By.name("birthday_month"));
	    WebElement yearele = driver.findElement(By.name("birthday_year"));
	    Select daydp=new Select(dayele);
	    Select monthdp=new Select(monthele);
	    Select yeardp=new Select(yearele);
	    daydp.selectByValue("6");
	    monthdp.selectByVisibleText("May");
	    yeardp.selectByValue("1987");
	    driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	    

	}

}
