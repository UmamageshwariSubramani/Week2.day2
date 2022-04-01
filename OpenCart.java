package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("Uma");
		driver.findElement(By.id("input-firstname")).sendKeys("Umamageshwari");
		driver.findElement(By.id("input-lastname")).sendKeys("subrmanai");
		driver.findElement(By.xpath("//label[text()='E-Mail']/following-sibling::input")).sendKeys("uma.s85@gmail.com");
		WebElement countrydp = driver.findElement(By.id("input-country"));
		Select dropd = new Select(countrydp);
		dropd.selectByVisibleText("India");
		driver.findElement(By.name("password")).sendKeys("Karmugilen");
	
		
		
		
		
		

	}

}
