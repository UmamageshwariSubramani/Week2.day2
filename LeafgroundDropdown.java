package Week1.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Thread.sleep(2000);
		WebElement indexdd = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dropdnindex=new Select(indexdd);
		dropdnindex.selectByIndex(1);
		WebElement textdd = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dropdntext=new Select(textdd);
		dropdntext.selectByVisibleText("UFT/QTP");
		WebElement valuedd = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select dropdnvalue=new Select(valuedd);
		dropdnvalue.selectByValue("2");
		
		
	   WebElement text = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	   Select opt=new Select(text);
	   boolean a = opt.isMultiple();
	   text.sendKeys("Selenium");
	   System.out.println("Selected option is "+opt.getFirstSelectedOption().getText());
	   
	   WebElement Dropdown6 = driver.findElement(By.xpath("//select[@multiple='']"));
		Select dd6 = new Select(Dropdown6);
		boolean b = dd6.isMultiple();
		System.out.println("dropdown6 is multiple:"+b);
		dd6.selectByIndex(2);
		dd6.selectByIndex(3);
	   
	 
	    
		
	    	
	    }
		

	}

