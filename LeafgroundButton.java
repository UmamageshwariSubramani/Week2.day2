package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//label[text()='Click button to travel home page']/following-sibling::button")).click();
		driver.navigate().back();
		
	    System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
	    
        System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
        
       
         System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
        
        
        
         
        
        
  
	
	} 
	


}
