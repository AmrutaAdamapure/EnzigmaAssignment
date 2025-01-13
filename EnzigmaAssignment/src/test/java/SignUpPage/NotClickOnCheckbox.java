//Amruta Adamapure
package SignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotClickOnCheckbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("amrutaadamapureaa@gmail.com");
		driver.findElement(By.xpath("(//button[@name='undefined'])[4]")).click();
		String web =  driver.findElement(By.xpath("//div[@class='content-margin']/h2")).getText();
		System.out.println(web);
		driver.quit();
	}
}
