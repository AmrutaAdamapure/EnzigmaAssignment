package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessfullyCompleted {
	public static void main(String[] args) throws InterruptedException {
		String actual_url = "https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amrutaadamapureaa@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amruta@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='staticElement'])[3]")).click();
		Thread.sleep(1000);
		String current_url = driver.getCurrentUrl();
		Thread.sleep(10000);
        if (actual_url!=current_url) {
			System.out.println("Account created successfully!");
		}
        driver.quit();
	}
}
