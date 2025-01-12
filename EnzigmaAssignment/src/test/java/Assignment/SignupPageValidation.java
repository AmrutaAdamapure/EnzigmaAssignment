//Amruta Adamapure
package Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPageValidation {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://app-staging.nokodr.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("amrutaadamapureaa@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[text()='Proceed']")).click();
	     Thread.sleep(10000);
	     String otp = sc.next();
	     driver.findElement(By.xpath("//input[@placeholder='Enter Code']")).sendKeys(otp);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Verify Code']")).click();
	}
}
