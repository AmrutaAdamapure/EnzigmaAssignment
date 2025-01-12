//Amruta Adamapure
package Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordValidationWithTryCatch {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        try {
            driver.get("https://app-staging.nokodr.com/");
            Thread.sleep(2000);

            WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
            email.sendKeys("amrutaadamapureaa@gmail.com");
            WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
            pass.sendKeys("Amruta@1234");
            driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
            Thread.sleep(2000);

            WebElement email1 = driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
            System.out.print("Please enter your email for password reset: ");
            String inputEmail = sc.nextLine();

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
               // driver.quit();
            }
            sc.close();
        }
    }
}