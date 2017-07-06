package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.MaropostEmailContactsPage;

public class MaropostEmailContactsTestCases {

	WebDriver driver;

    MaropostEmailContactsPage objLogin;
    
    ExtentReports extentreports = new ExtentReports(System.getProperty("user.dir") +"/test-output/MaropostContactsTestReport.html", true);
    
    ExtentTest maroposttest;

    @BeforeSuite

    public void setup(){

    	System.setProperty("webdriver.gecko.driver","/Users/maropost/Downloads/geckodriver");
    	
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("");

    }
   
    // Test Case - 1 : Verifying the Sign In Section with valid Email & Password
    
	@Test
 
    public void test_verify_signin_section() throws InterruptedException {
        
        maroposttest = extentreports.startTest("test_verify_signin_section");
    	
    	//Create Login Page object

    	objLogin = new MaropostEmailContactsPage(driver);
    	
    	driver.manage().window().maximize();  
    	
    	maroposttest.log(LogStatus.INFO, "Opening new browser with maropost contacts url");

    	//login to application

    	objLogin.loginToMaropostWebApp("", "");
    	
    	maroposttest.log(LogStatus.INFO, "Entering user email");
    	
    	maroposttest.log(LogStatus.INFO, "Entering user password");
    	
    	maroposttest.log(LogStatus.INFO, "Clicking on login button");
    	
        WebElement msg = driver.findElement(By.cssSelector(".flash"));
        
        String actualresult = msg.getText();
        
        String expectedresult = "Signed in successfully.";
        
        if(actualresult.equalsIgnoreCase(expectedresult)){
        
        	maroposttest.log(LogStatus.PASS, "Actual Result ::  " + actualresult );
        
        }
	}
        @Test (dependsOnMethods = "test_verify_signin_section")
        
        public void test_click_on_new_contacts_list() throws InterruptedException{
            
        	maroposttest = extentreports.startTest("test_click_on_new_contacts_list");
        	
            objLogin.clickNewContactsListOption();
        	
            maroposttest.log(LogStatus.INFO, "Click on new list under contacts");

            Thread.sleep(3000);
     }
		
        @AfterSuite (alwaysRun = true)
		public void tearDown() throws Exception {
	 
	    	extentreports.endTest(maroposttest);
	    	extentreports.flush();
	    	//extent.close();
	    	driver.quit();
	  
	} 
}
