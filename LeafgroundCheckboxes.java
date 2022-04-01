package Week1.day1;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.functors.IfClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		boolean result = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following-sibling::input")).isSelected();
		
		if (result==true) {
			System.out.println("Selenium checkbox is selected");
		
		}else {
				System.out.println("Selenium checkbox is not selected");
				
			}
		WebElement checkbx= driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following-sibling::input[2]"));
	       boolean value = checkbx.isSelected();
	       System.out.println("checkbox selected status "+value);
	       if (value==true) {
	    	   checkbx.click();
	    	   boolean selected = checkbx.isSelected();
	    	   System.out.println("Checkbox selected status "+selected);
			
		}
       List<WebElement> chkbx = driver.findElements(By.xpath("//label[contains(text(),'below ')]/following-sibling::input[@type='checkbox']"));
			int size = chkbx.size();
			System.out.println("size is "+size);
				for(int i=0; i<size; i++) {
					chkbx.get(i).click();
				}
		}
	
	
	}
	
			
			
	

		

	


