//Amruta Adamapure
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageValidation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amrutaadamapureaa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amruta@123");
		Thread.sleep(2000);
		driver.findElement(By.id("rememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}
}
