package giftvoulcher;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

// add new gift voucher with selecting the message template.
public class AddNewGiftVoucher2 {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("_disable-notifications", "start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
	System.out.println("Let's start with login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://qa.miostack.com/");
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krishnaecrystal123@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qazwsx@123");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Akash']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//i[@class='font-icon fal fa-cog']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Gift Voucher')]")).click();
	driver.findElement(By.xpath("//button[text()='Add Gift Voucher']")).click();
	driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-valid'])[3]")).sendKeys("new year voucher");
	driver.findElement(By.xpath("//input[@data-ng-model='giftVoucher.grossPrice']")).sendKeys("1000");
	driver.findElement(By.xpath("//input[@data-ng-model='giftVoucher.giftAmount']")).sendKeys("10");
	WebElement validity = driver.findElement(By.xpath("//select[contains(@class,'selectpicker')]"));
	Select selectOptionsForValidity=new Select(validity);
	selectOptionsForValidity.selectByVisibleText("Days");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-ng-model='giftVoucher.validity']")).sendKeys("90");
	WebElement tax = driver.findElement(By.xpath("(//select[contains(@class,'selectpicker')])[2]"));
	Select selectOptionsForTax=new Select(tax);
	selectOptionsForTax.selectByVisibleText("GST(18)");
	
	 driver.findElement(By.xpath("//span[text()='Select Applicable Branches']")).click();
	 driver.findElement(By.xpath("//button[text()='Select All']")).click();
	 /*
	WebElement selectBranch = driver.findElement(By.xpath("(//select[contains(@class,'selectpicker')])[4]"));
	Select selectTheBranch=new Select(selectBranch);
	selectTheBranch.selectByVisibleText("krishnaveni, Velachery");
	selectTheBranch.selectByVisibleText("krishnaveni, Avadi");
	*/
	driver.findElement(By.xpath("//label[@for='showOnline']")).click();
	driver.findElement(By.xpath("//label[@for='isCustom']")).click();
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn ng-binding ng-scope btn-primary-outline']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn ng-binding ng-scope btn-primary-outline']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='btn'])[4]")).click();
	driver.findElement(By.xpath("(//button[@class='btn ng-binding ng-scope btn-primary-outline'])[2]")).click();
	
     driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	 driver.close();
		throw new RuntimeException();
}
}
