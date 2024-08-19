package parabank;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultipleLinks {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String exp_url = "https://parabank.parasoft.com/parabank/index.htm";
	
		Thread.sleep(2000);
		
		driver.get(exp_url);
		
		if ((driver.getCurrentUrl()).equals(exp_url)) {
			System.out.println("You are at Para Bank landing page");

			List<WebElement> links = driver.findElements(By.xpath("//div[@id='footerPanel']/ul/li/a"));
			
			for (int i = 0; i < links.size()-1; i++) {
				links.get(i).click();
				Thread.sleep(1000);
				if (i == 3 || i == 4 || i == 5) {
					driver.navigate().back();
					Thread.sleep(2000);
				}else {
					Thread.sleep(2000);
				}
			}
			
			Thread.sleep(3000);
			
			driver.close();
		}else {
			System.out.println("You are not at Para Bank landing page");
			driver.close();
		}
	}
}
