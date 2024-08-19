package parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterToParaBank {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		String exp_url = "https://parabank.parasoft.com/parabank/index.htm";
		String exp_reg_title = "ParaBank | Register for Free Online Account Access";
		driver.manage().window().maximize();
		driver.get(exp_url);
		
		Thread.sleep(2000);
		
		if ((driver.getCurrentUrl()).equals(exp_url)) {
			System.out.println("You are at Para Bank Homepage.");
			
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			Thread.sleep(2000);
			
			if ((driver.getTitle()).equals(exp_reg_title)) {
				System.out.println("You are at register page");
				
				driver.findElement(By.id("customer.firstName")).sendKeys("Payal");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.lastName")).sendKeys("Chaudhari");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.address.street")).sendKeys("Karve Nagar");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.address.city")).sendKeys("Pune");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.address.zipCode")).sendKeys("444102");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.phoneNumber")).sendKeys("7888251521");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.ssn")).sendKeys("1963");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.username")).sendKeys("1901010@gcoej.ac.in");
				Thread.sleep(1000);
				driver.findElement(By.id("customer.password")).sendKeys("Gcoej@123");
				Thread.sleep(1000);
				driver.findElement(By.id("repeatedPassword")).sendKeys("Gcoej@123");
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@value='Register']")).click();
				
				Thread.sleep(3000);
				
			}else {
				System.out.println("You are at register page");
				driver.close();
			}
			
			driver.close();
		}else {
			System.out.println("You are at Para Bank Homepage.");
			driver.close();
		}
	}
}
