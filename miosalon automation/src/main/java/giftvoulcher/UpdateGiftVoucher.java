package giftvoulcher;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdateGiftVoucher {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("_disable-notifications", "start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/*driver.get("https://chrome.google.com/webstore/detail/buster-captcha-solver-for/mpbjkejclgfgadiemmefgebjfooflfhl");
	driver.findElement(By.xpath("//div[text()='Add to Chrome']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	*/
	driver.get("https://www.miosalon.com/");
	//driver.findElement(By.xpath("//a[text()='Log In']"));
	driver.findElement(By.linkText("Log In")).click();
	driver.findElement(By.id("username")).sendKeys("krishna20009697@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sripriya.k");
	/*driver.switchTo().frame(0);
	driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']")).click();
	driver.switchTo().defaultContent(); */
	Thread.sleep(2000); 
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='krishnaveni']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//i[@class='font-icon fal fa-cog']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Gift Voucher')]")).click();
	driver.findElement(By.xpath("//td[@class='ng-binding']")).click();
	driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-valid'])[3]")).sendKeys("Tamil new year voucher");
	driver.findElement(By.xpath("//label[@for='giftvoenable']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn ng-binding ng-scope btn-primary-outline']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn ng-binding ng-scope btn-primary-outline']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='btn'])[4]")).click();
	driver.findElement(By.xpath("(//button[@class='btn ng-binding ng-scope btn-primary-outline'])[2]")).click();
	
     driver.findElement(By.xpath("//button[text()='Update']")).click();
	 driver.close();
		throw new RuntimeException();
}
}
