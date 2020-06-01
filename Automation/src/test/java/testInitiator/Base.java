package testInitiator;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;





public class Base {

//	public static ChromeDriver driver;
	 public static WebDriver driver;
	 
	 
	            
	
	
	protected static String yamlFilePath = System.getProperty("user.dir") + "\\Testdata\\LSCP_Test_Data.yml";

	

	public void launchBrowser () throws FileNotFoundException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vranjha.EAD\\Desktop\\Workspace\\Automation\\Driver2\\chromedriver.exe");
		        driver = new ChromeDriver();
		        SleepWait(1);	
		        driver.manage().window().maximize();
		        SleepWait(1);	
			  
		     		        
	}
	
	public WebElement waitForElementToBeVisibile(By locator) {	
		
	    WebDriverWait wait = new WebDriverWait (driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();

	}
	
	
	protected static String getURL() throws FileNotFoundException {
		
	
		Yaml yaml = new Yaml();	
		FileReader file = new FileReader(yamlFilePath);		
		Map<String, Object> Object = (Map<String, Object>) yaml.load(file);
		String value = (String) Object.get("PROD_URL");
		return value;
		
	 
	}
	
	public void Sync() {
		//SleepWait(2);
		while(driver.findElements(By.className("loader")).size()>0)
		while(driver.findElements(By.xpath("//*[contains(@alt ,'loading')]")).size()>0)
		
		{
			
			System.out.println("Waiting");
			
		}
	}
	//Sleep and wait function. 
	public void SleepWait(long timeInSeconds){
		long t= System.currentTimeMillis();
		timeInSeconds = timeInSeconds*1000;
		long end = t + timeInSeconds;

		while(System.currentTimeMillis() < end){
			// to do something
		}
	}//end sleep and function. 
	
	protected int randomValue() {
		Random r = new Random();
		int x = r.nextInt(1000);
		return x;
	}
	
	public void SelectValueFromDropDown(){
		Actions DrpDwn = new Actions(driver);
		DrpDwn.sendKeys(Keys.ARROW_DOWN);
		DrpDwn.sendKeys(Keys.ENTER);
		DrpDwn.perform();
		SleepWait(1);
	}
	public void SelectValueFromDropDown3(){
		Actions DrpDwn = new Actions(driver);
		DrpDwn.sendKeys(Keys.ARROW_DOWN);
		DrpDwn.sendKeys(Keys.ARROW_DOWN);
		DrpDwn.sendKeys(Keys.ARROW_DOWN);
		DrpDwn.sendKeys(Keys.ENTER);
		DrpDwn.perform();
		SleepWait(1);
	}
	
	public void refreshPage(){
		driver.navigate().refresh();
		Sync();
		Sync();
	}
	

	 public void hardWait(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	 }
	 public void ScrollUp(){
			((JavascriptExecutor) driver).executeScript("scroll(0, -250);");
			SleepWait(2);
		}
	 
		public void ZoomOut(){
			Actions DrpDwn = new Actions(driver);
			DrpDwn.sendKeys(Keys.CONTROL,Keys.SUBTRACT);
			DrpDwn.sendKeys(Keys.CONTROL,Keys.SUBTRACT);
			DrpDwn.perform();
			SleepWait(1);
	}
		
	 
	public void RightClick(){
		Actions DrpDwn = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@class='k-grid-table-wrap']//tr[1]/td[2]"));
		DrpDwn.contextClick(elementLocator).build().perform();
		
	}
	
}