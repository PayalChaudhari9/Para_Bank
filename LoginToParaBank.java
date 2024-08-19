package parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToParaBank {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String exp_url = "https://parabank.parasoft.com/parabank/index.htm";
	
		Thread.sleep(2000);
		
		driver.get(exp_url);
		
		if ((driver.getCurrentUrl()).equals(exp_url)) {
			System.out.println("You are at Para Bank landing page");

			driver.findElement(By.name("username")).sendKeys("1901010@gcoej.ac.in");
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys("Gcoej@123");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			
			Thread.sleep(3000);
			
			driver.close();
		}else {
			System.out.println("You are not at Para Bank landing page");
			driver.close();
		}
	}
}
