//Amruta Adamapure
package Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageValidationWithTryCatch {
	public static void main(String[] args) throws InterruptedException {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);
        // Set up ChromeDriver
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        try {
            driver.get("https://app-staging.nokodr.com/");
            Thread.sleep(2000);
            
            WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
            email.sendKeys("amrutaadamapureaa@gmail.com");
            WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
            pass.sendKeys("Amruta@123");
            driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
            Thread.sleep(2000);

            if (driver.findElements(By.xpath("//div[contains(text(), 'Welcome')]")).size() > 0) {
                System.out.println("Login successful!");
            } else if (driver.findElements(By.xpath("//div[contains(text(), 'invalid')]")).size() > 0) {
                System.out.println("Login failed: Invalid email or password.");
            } else {
                System.out.println("Login attempt was made, but no confirmation message was found.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                //driver.quit();
            }
            sc.close();
        }
    }
}
