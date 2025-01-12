//Amruta Adamapure
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordValidation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("amrutaadamapureaa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Proceed']")).click();
	}
}
