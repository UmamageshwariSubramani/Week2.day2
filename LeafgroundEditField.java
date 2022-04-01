package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEditField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[@id='email']")).sendKeys("uma.s85@gmail.com");
		WebElement eletext = driver.findElement(By.xpath("//input[@value='Append ']"));
		eletext.sendKeys("TestLeaf",Keys.TAB);
		String enteredtext = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("Value");
		System.out.println(enteredtext);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (enabled) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
			
			
		}
				

	}


