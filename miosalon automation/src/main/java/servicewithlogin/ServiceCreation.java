package servicewithlogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//create a service group and service with add the products.
public class ServiceCreation {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("_disable-notifications", "start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		System.out.println("Let's start with login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://qa.miostack.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("krishnaecrystal123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qazwsx@123");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[text()='Akash']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@package-label='SETTINGS']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[contains(text(),'Service')])[2]")).click();
		driver.findElement(By.id("addNewGroup")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    WebElement modalTrigger = driver.findElement(By.xpath("//input[@data-ng-model='servicegroup']"));
        modalTrigger.click();
        modalTrigger.sendKeys("automation");
        System.out.println("A service group is created");
		driver.findElement(By.xpath("//button[@id='tourSave']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='collapsed'])[last()]//small[text()='  Add Service ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-valid'])[2]")).sendKeys("test service");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-valid-number ng-valid-min']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@data-ng-model='service.fullprice']")).sendKeys("150");
		driver.findElement(By.xpath("//span[text()='Select staff']")).click();
		driver.findElement(By.xpath("(//li[@data-original-index='2'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Not applicable']")).click();
		driver.findElement(By.xpath("//a/span[text()='GST(18)']")).click();
		driver.findElement(By.xpath("//button[text()='Add Product']")).click();
		driver.findElement(By.xpath("//button[@title='Select Product']")).click();
		driver.findElement(By.xpath("(//div[@class='bs-searchbox']/input[@aria-label='Search'])[3]")).sendKeys("Linseed Extract", Keys.ENTER);
		/*WebElement selectProduct=driver.findElement(By.xpath("(//select[@class='selectpicker form-control ng-pristine ng-valid'])[3]"));
		Select products= new Select(selectProduct);
		products.selectByVisibleText("Linseed Extract"); */
		Thread.sleep(2000);
		WebElement qun =driver.findElement(By.xpath("//div[@class='form-group']/input[@data-ng-model='service.products[$index].quantity']"));
		qun.click();
		qun.clear();
		qun.sendKeys("10");
		driver.findElement(By.xpath("//div[@class='alert alert-info alert-no-border']/p")).click();
		
	//	driver.findElement(By.xpath("(//button[text()='Cancel'])[2]")).click();
				
		driver.findElement(By.xpath("//button[@id='tourSaveService']")).click();
		System.out.println("A service with product consumption is added to the created group");
	//	driver.close();
	//	throw new RuntimeException();
				
}				
}	
		

