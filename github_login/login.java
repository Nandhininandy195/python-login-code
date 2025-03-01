package github_login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64-133.0.69 DRIVER\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://github.com/login");
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("nandhininandy195@gmail.com");
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qyvanyd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[13]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();

	}

}
