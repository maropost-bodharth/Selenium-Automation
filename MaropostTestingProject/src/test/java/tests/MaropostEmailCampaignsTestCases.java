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
import pages.MaropostEmailCampaignsPage;


public class MaropostEmailCampaignsTestCases {

    WebDriver driver;

    MaropostEmailCampaignsPage objLogin;
    
    ExtentReports extentreports = new ExtentReports(System.getProperty("user.dir") +"/test-output/MaropostCampaignsTestReport.html", true);
    
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

    	objLogin = new MaropostEmailCampaignsPage(driver);
    	
    	driver.manage().window().maximize();  
    	
    	maroposttest.log(LogStatus.INFO, "Opening new browser with maropost campagains url");

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
    
    public void test_click_on_new_campaign_schedule_recurring() throws InterruptedException{
        
    	maroposttest = extentreports.startTest("test_click_on_new_campaign_schedule_recurring");
    	
        objLogin.clickNewCampaignOption();
    	
        maroposttest.log(LogStatus.INFO, "Click on new campaign");
        
        objLogin.enterNewCampaignDetails("Selenium", "Automation", "", "gcp", "gcpdsp@gmail.com", "gcpdsp@gmail.com", "HELLO");
 
        maroposttest.log(LogStatus.INFO, "Entering New Campaign Details");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
        
        Thread.sleep(2000);
        
        objLogin.newCampaignNextButton();
        
        maroposttest.log(LogStatus.INFO, "Click on next button");
        
        jse.executeScript("window.scrollBy(0,300)", "");
        
        objLogin.newCampaignScheduleRecurring();
        
        maroposttest.log(LogStatus.INFO, "Click on Schedule button");
        
        maroposttest.log(LogStatus.INFO, "Click on confirm schedule option button");
        
        Thread.sleep(5000);
        
        WebElement successmsg = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]"));
        
        String actualresult = successmsg.getText();
        
        String expectedresult = "Campaign was successfully updated.";
        
        if(actualresult.equalsIgnoreCase(expectedresult)){
        
        	maroposttest.log(LogStatus.PASS, "Result ::  " + actualresult );
        }
        Thread.sleep(5000);
    }
   
    @Test (dependsOnMethods = "test_click_on_new_campaign_schedule_recurring")
    
    public void test_click_on_new_campaign_schedule_priority() throws InterruptedException{
        
    	maroposttest = extentreports.startTest("test_click_on_new_campaign_schedule_priority");
    	
        objLogin.clickNewCampaignOption();
    	
        maroposttest.log(LogStatus.INFO, "Click on new campaign");
       
        objLogin.enterNewCampaignDetails("Selenium", "Automation", "", "gcp", "gcpdsp@gmail.com", "gcpdsp@gmail.com", "HELLO");
    
        maroposttest.log(LogStatus.INFO, "Entering New Campaign Details");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
        
        Thread.sleep(2000);
        
        objLogin.newCampaignNextButton();
        
        maroposttest.log(LogStatus.INFO, "Click on next button");
        
        jse.executeScript("window.scrollBy(0,300)", "");
        
        objLogin.newCampaignSchedulePriority();
        
        maroposttest.log(LogStatus.INFO, "Click on Schedule button");
        
        maroposttest.log(LogStatus.INFO, "Click on confirm schedule option button");
        
        Thread.sleep(5000);

        WebElement successmsg = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]"));
        
        String actualresult = successmsg.getText();
        
        String expectedresult = "Campaign was successfully updated.";
        
        if(actualresult.equalsIgnoreCase(expectedresult)){
        
        	maroposttest.log(LogStatus.PASS, "Result ::  " + actualresult );
        }
        
        Thread.sleep(5000);
    }

    @Test (dependsOnMethods = "test_click_on_new_campaign_schedule_priority")
    
    public void test_click_on_new_campaign_schedule_priority_without_Date() throws InterruptedException{
        
    	maroposttest = extentreports.startTest("test_click_on_new_campaign_schedule_priority_without_Date");
    	
        objLogin.clickNewCampaignOption();
    	
        maroposttest.log(LogStatus.INFO, "Click on new campaign");
      
        objLogin.enterNewCampaignDetails("Selenium", "Automation", "", "gcp", "gcpdsp@gmail.com", "gcpdsp@gmail.com", "HELLO");
      
        maroposttest.log(LogStatus.INFO, "Entering New Campaign Details");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
        
        Thread.sleep(2000);
        
        objLogin.newCampaignNextButton();
        
        maroposttest.log(LogStatus.INFO, "Click on next button");
        
        jse.executeScript("window.scrollBy(0,300)", "");
        
        objLogin.newCampaignSchedulePriorityWithoutDate();
        
        maroposttest.log(LogStatus.INFO, "Click on Schedule button");
        
        maroposttest.log(LogStatus.INFO, "Click on confirm schedule option button");
        
        Thread.sleep(5000);
        
        WebElement successmsg = driver.findElement(By.xpath("//*[@id=\"error_explanation\"]/ul/li"));
        
        String actualresult = successmsg.getText();
        
        String expectedresult = "Send at can't be blank.";
        
        if(actualresult.equalsIgnoreCase(expectedresult)){
        
        	maroposttest.log(LogStatus.FAIL, "Result ::  " + actualresult );
        }
        Thread.sleep(5000);
    }
    
    @Test (dependsOnMethods = "test_click_on_new_campaign_schedule_priority_without_Date")
    
    public void test_click_on_new_AB_campaign() throws InterruptedException{
        
    	maroposttest = extentreports.startTest("test_click_on_new_AB_campaign");
    	
        objLogin.clickNewABCampaignOption();
    	
        maroposttest.log(LogStatus.INFO, "Click on new AB campaign");
 
        objLogin.enterNewABCampaignDetails("Selenium", "gcpdsp@gmail.com", "gcpdsp@gmail.com");
       
        maroposttest.log(LogStatus.INFO, "Entering New AB Campaign Details");
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
        
        Thread.sleep(2000);
        
        objLogin.newABCampaignNextButton(); 
        
        Thread.sleep(3000);
        
        objLogin.newABCampaignGroupSelection("HELLO", "HELLO");
        
        Thread.sleep(3000);
        
    }
    
 /*
    @Test (dependsOnMethods = "test_click_on_new_campaign_schedule_priority_without_Date")
    
    public void test_click_delete_campaign() throws InterruptedException{
        
    	maroposttest = extentreports.startTest("test_click_delete_campaign");
    	
    	Thread.sleep(2000);
    	
    	maroposttest.log(LogStatus.INFO, "Click on delete button");
        
        objLogin.deleteCampaign();
        
        maroposttest.log(LogStatus.INFO, "Campaign was deleted successfully");
        
        Thread.sleep(3000);
    }	
    	
 
    @Test (dependsOnMethods = "test_verify_signin_section")
    
    public void test_click_name_under_campaign() throws InterruptedException{
        
        test = extent.startTest("test_click_name_under_campaign");
    	
        objLogin.clickOnNameUnderCampaign();
    	
        test.log(LogStatus.INFO, "Maropost campaign name dashboard is opened");
        
        test.log(LogStatus.INFO, "Clicking on campaign");
    }
 */ 
    
    @AfterSuite (alwaysRun = true)
	public void tearDown() throws Exception {
 
    	extentreports.endTest(maroposttest);
    	extentreports.flush();
    	//extent.close();
    	driver.quit();
  
	}
}