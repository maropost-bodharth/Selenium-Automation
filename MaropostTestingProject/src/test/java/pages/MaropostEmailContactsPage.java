package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MaropostEmailContactsPage {

	WebDriver driver;
    
    By useremail = By.id("user_email");

    By userpassword = By.id("user_password");

    By signin = By.name("commit");

    By signout = By.xpath("/html/body/header/div/nav/ul/li[7]/a");
    
    public MaropostEmailContactsPage(WebDriver driver) throws InterruptedException{

        this.driver = driver;
        
    }
    
    //Set user name in text box

    public void setUserEmail(String strUserName){

        driver.findElement(useremail).sendKeys(strUserName);;

    }

    //Set password in text box

    public void setUserPassword(String strPassword){

         driver.findElement(userpassword).sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            driver.findElement(signin).click();

    }
    
    //Click on logout button

    public void clickLogout(){

            driver.findElement(signout).click();

    }
    
    public void loginToMaropostWebApp(String strUserName,String strPasword) throws InterruptedException{

        //Fill user name

        this.setUserEmail(strUserName);
       
        //Fill password

        this.setUserPassword(strPasword);

        //Click Login button

        this.clickLogin(); 
        
    }
    
    public void clickNewContactsListOption() throws InterruptedException{     
        
    	WebElement newList = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div[2]/div/a"));
       
        newList.click();
    
        Thread.sleep(2000);
		
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement listName = driver.findElement(By.id("list_name"));
        
        listName.sendKeys("Automation_List");
    	
    	Thread.sleep(2000);
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsFieldOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newField = driver.findElement(By.linkText("New Field"));

    	newField.click();
    	
    	Thread.sleep(2000);
    	
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement fieldName = driver.findElement(By.id("custom_field_name"));
        
        fieldName.sendKeys("Automation_Field");
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsTagOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newField = driver.findElement(By.linkText("New Tag"));

    	newField.click();
    	
    	Thread.sleep(2000);
    	
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement tagName = driver.findElement(By.id("tag_name"));
        
        tagName.sendKeys("Automation_Tag");
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsBrandOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newField = driver.findElement(By.linkText("New Brand"));

    	newField.click();
    	
    	Thread.sleep(2000);
    	
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement brandName = driver.findElement(By.id("brand_name"));
        
        brandName.sendKeys("Automation_Brand");
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsSecureListOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newField = driver.findElement(By.linkText("New Secure List"));

    	newField.click();
    	
    	Thread.sleep(2000);
    	
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement secureListName = driver.findElement(By.id("secure_list_name"));
        
        secureListName.sendKeys("Automation_Secure_List");
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsTableOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newTable = driver.findElement(By.linkText("New Table"));

    	newTable.click();
    	
    	Thread.sleep(2000);
    	
    	WebElement tableName = driver.findElement(By.id("relational_table_name"));
        
        tableName.sendKeys("automationtable");
    	
    	Thread.sleep(2000);
    	
    	WebElement name = driver.findElement(By.xpath("//*[@id=\"relational_table_relational_columns_attributes_0_name\"]"));
        
        name.sendKeys("automationtable");
        
        WebElement primaryKeyCheckbox = driver.findElement(By.xpath("//*[@id=\"relational_table_relational_columns_attributes_0_primary_key\"]"));
        
        primaryKeyCheckbox.click();
        
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsSQLQueryOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newSQLQuery = driver.findElement(By.linkText("New SQL Query"));

    	newSQLQuery.click();
    	
    	Thread.sleep(2000);
    	
    	WebElement sqlQueryName = driver.findElement(By.id("relational_query_name"));
        
        sqlQueryName.sendKeys("automationsql");
    	
    	Thread.sleep(2000);
    	
    	WebElement sqlQuery = driver.findElement(By.id("relational_query_query"));
        
        sqlQuery.sendKeys("SELECT Email,Subject From demo_123");
        
        WebElement primaryKeyCheckbox = driver.findElement(By.xpath("//*[@id=\"relational_query_target_ids_\"]"));
        
        primaryKeyCheckbox.click();
        
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickNewContactsNewPreferencePageOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
       
        contacts.click();
    
        Thread.sleep(2000);
		
        WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/i"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        
    	WebElement newPreferencePage = driver.findElement(By.linkText("New Preference Page"));

    	newPreferencePage.click();
    	
    	Thread.sleep(2000);
    	
    	WebElement preferencePageName = driver.findElement(By.id("preference_page_name"));
        
    	preferencePageName.sendKeys("automationpreferencepage");
    	
    	Thread.sleep(2000);
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    }

    public void clickEditContactsListOption() throws InterruptedException{     
        
    	WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[2]/a"));
        
        contacts.click();
    
        Thread.sleep(2000);
	
    	WebElement editList = driver.findElement(By.cssSelector("a[title=\"Edit list.\"]"));
    	
    	editList.click();
    	
    	driver.switchTo().activeElement();
    	
    	Thread.sleep(2000);
    	
    	WebElement editPage = driver.findElement(By.id("list_description"));
        
    	editPage.sendKeys("editing the list");
    	
    	Thread.sleep(2000);
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	
        jse.executeScript("window.scrollBy(0,500)", "");
    	
    	driver.findElement(By.name("commit")).click();
    	
    	Thread.sleep(3000);
    	
    }

}

