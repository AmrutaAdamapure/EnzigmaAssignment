//Amruta Adamapure
package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://app-staging.nokodr.com/");
	     
	    }
}
