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
    
    // Test Case - 2 : Create New List
    
    @Test (dependsOnMethods = "test_verify_signin_section")
        
    public void test_create_new_contacts_list() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_list");
        	
        objLogin.clickNewContactsListOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new list under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New List Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "List was created successfully");
            
        Thread.sleep(2000);
     }
		
	// Test Case - 3 : Create New Field
    
    @Test (dependsOnMethods = "test_create_new_contacts_list")
        
    public void test_create_new_contacts_field() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_field");
        	
        objLogin.clickNewContactsFieldOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new field under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Field Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "Field was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 4 : Create New Tag
    
    @Test (dependsOnMethods = "test_create_new_contacts_field")
        
    public void test_create_new_contacts_tag() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_tag");
        	
        objLogin.clickNewContactsTagOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new tag under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Tag Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "Tag was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 5 : Create New Brand
    
    @Test (dependsOnMethods = "test_create_new_contacts_tag")
        
    public void test_create_new_contacts_brand() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_brand");
        	
        objLogin.clickNewContactsBrandOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new brand under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Brand Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "Brand was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 6 : Create New Secure List
    
    @Test (dependsOnMethods = "test_create_new_contacts_brand")
        
    public void test_create_new_contacts_secure_list() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_secure_list");
        	
        objLogin.clickNewContactsSecureListOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new secure list under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Secure List Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "Secure list was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 7 : Create New Table
    
    @Test (dependsOnMethods = "test_create_new_contacts_brand")
        
    public void test_create_new_contacts_table() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_table");
        	
        objLogin.clickNewContactsTableOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new table under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Table Name");
        
        maroposttest.log(LogStatus.INFO, "Enter New Relational Table Name");
        
        maroposttest.log(LogStatus.INFO, "Select Primarykey & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "Table was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 8 : Create New SQL Query
    
    @Test (dependsOnMethods = "test_create_new_contacts_brand")
        
    public void test_create_new_contacts_sqlquery() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_sqlquery");
        	
        objLogin.clickNewContactsSQLQueryOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new sql query under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New SQL Query Name");
        
        maroposttest.log(LogStatus.INFO, "Enter Query");
        
        maroposttest.log(LogStatus.INFO, "Select Targets & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "SQL Query was created successfully");
            
        Thread.sleep(2000);
     }
    
    // Test Case - 9 : Create New Preference Page
    
    @Test (dependsOnMethods = "test_create_new_contacts_brand")
        
    public void test_create_new_contacts_preference_page() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_create_new_contacts_preference_page");
        	
        objLogin.clickNewContactsNewPreferencePageOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on new preference page under contacts");
        
        maroposttest.log(LogStatus.INFO, "Enter New Preference Page Name & Click on Save button");
        
        maroposttest.log(LogStatus.INFO, "SQL Query was created successfully");
            
        Thread.sleep(2000);
     }
  
    // Test Case - 10 : To Edit List
    
    @Test (dependsOnMethods = "test_create_new_contacts_preference_page")
        
    public void test_to_edit_contacts_list() throws InterruptedException{
            
    	maroposttest = extentreports.startTest("test_to_edit_contacts_list");
        	
        objLogin.clickEditContactsListOption();
        	
        maroposttest.log(LogStatus.INFO, "Click on edit option under contacts list");
            
        Thread.sleep(2000);
     }
    
    @AfterSuite (alwaysRun = true)
    
    public void tearDown() throws Exception {
	 
    	extentreports.endTest(maroposttest);
	    	
	  	extentreports.flush();
	    	
	   	//extent.close();
	    	
	   	driver.quit();
	  
	} 
}
