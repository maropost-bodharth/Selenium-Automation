package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MaropostEmailCampaignsPage {

    WebDriver driver;
    
    By useremail = By.id("user_email");

    By userpassword = By.id("user_password");

    By signin = By.name("commit");

    By signout = By.xpath("/html/body/header/div/nav/ul/li[7]/a");
  
    By campaignname = By.xpath("//*[@id=\"campaign_name\"]");
    
    By subject = By.xpath("//*[@id=\"campaign_subject\"]");
  
    By preheader = By.xpath("//*[@id=\"campaign_preheader\"]");  // Optional
    
    By fromname = By.xpath("//*[@id=\"campaign_from_name\"]");
    
    By fromemail = By.xpath("//*[@id=\"campaign_from_email\"]");
    
    By replyto = By.xpath("//*[@id=\"campaign_reply_to\"]");
  
    By content = By.xpath("//*[@id=\"new_campaign\"]/table/tbody/tr[8]/td[2]/span/input");
  
    By groupAcontent = By.xpath("//*[@id=\"campaign_groups\"]/div[1]/table/tbody/tr/td[2]/div[2]/span/input");
    
    By groupBcontent = By.xpath("//*[@id=\"campaign_groups\"]/div[2]/table/tbody/tr/td[2]/div[2]/span/input");
    
    public MaropostEmailCampaignsPage(WebDriver driver) throws InterruptedException{

        this.driver = driver;
        
        Thread.sleep(3000);
        
    }

    public void enterCampaignName(String strCampaignName){

        driver.findElement(campaignname).sendKeys(strCampaignName);;

    }
    
    public void enterSubject(String strSubject){

        driver.findElement(subject).sendKeys(strSubject);;

    }
    
    public void enterPreHeader(String strPreHeader){

        driver.findElement(preheader).sendKeys(strPreHeader);;

    }
    
    public void enterFromName(String strFromName){

        driver.findElement(fromname).sendKeys(strFromName);;

    }
    
    public void enterFromEmail(String strFromEmail){

        driver.findElement(fromemail).sendKeys(strFromEmail);;

    }
    
    public void enterReplyTo(String strReplyTo){

        driver.findElement(replyto).sendKeys(strReplyTo);;

    }
    
    public void enterContent(String strContent){

        driver.findElement(content).sendKeys(strContent);;

    }
    
    public void enterGroupAContent(String strGroupAContent){

        driver.findElement(groupAcontent).sendKeys(strGroupAContent);;

    }
    
    public void enterGroupBContent(String strGroupBContent){

        driver.findElement(groupBcontent).sendKeys(strGroupBContent);;

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
    
    //click button
    
    public void click(){
    	
    	driver.switchTo().alert().accept();
    	
    }
    
    public void loginToMaropostWebApp(String strUserName,String strPasword) throws InterruptedException{

        //Fill user name

        this.setUserEmail(strUserName);
        
        Thread.sleep(3000);
        
        //Fill password

        this.setUserPassword(strPasword);

        Thread.sleep(3000);
        
        //Click Login button

        this.clickLogin(); 
        
        Thread.sleep(10000);
       
    }
    
    public void clickNewCampaignOption() throws InterruptedException{     
    	
    	WebElement Campaign = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[1]/a"));

    	Campaign.click();
    	
    	WebElement newCampaign = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div[2]/div/a[1]"));

    	newCampaign.click();
    
    }
    
    public void enterNewCampaignDetails(String strCampaignName, String strSubject, String strPreHeader, String strFromName, String strFromEmail, String strReplyTo, String strContent) throws InterruptedException{     
        
    	Thread.sleep(3000);
    	
    	this.enterCampaignName(strCampaignName);
    
    	Thread.sleep(3000);
    
    	this.enterSubject(strSubject);
    
    	Thread.sleep(3000);
    
    	this.enterPreHeader(strPreHeader);
    
    	Thread.sleep(3000);
    
    	this.enterFromName(strFromName);
    
    	Thread.sleep(3000);
    
    	this.enterFromEmail(strFromEmail);
    
    	Thread.sleep(3000);
    
    	this.enterReplyTo(strReplyTo);
    
    	Thread.sleep(3000);
    	
    	this.enterContent(strContent);
    	
    	Thread.sleep(3000);
    	
    	// Select list option
    	WebElement list = driver.findElement(By.id("list_24432"));
    	 
    	list.click();
    	
    	Thread.sleep(2000);
    }	
    	
    public void newCampaignNextButton() throws InterruptedException{     
    	    
    	// Click on next button
        
    	WebElement next = driver.findElement(By.xpath("//*[@id=\"schedule_campaign_btn\"]"));
   	 
    	next.click();
    	
    	Thread.sleep(10000);
    	
    	WebElement spamNext = driver.findElement(By.partialLinkText("Next"));
      	 
    	spamNext.click();
    	
    	Thread.sleep(5000);
    	
    	
    }
    public void newCampaignScheduleRecurring() throws InterruptedException{
    	
    	WebElement schedulerecurring = driver.findElement(By.xpath("//*[@id=\"campaign_recurring_schedule_monthly\"]"));
      	 
    	schedulerecurring.click();
    	
    	Thread.sleep(5000);
  
    	WebElement scheduleButton = driver.findElement(By.linkText("Schedule"));
     	 
    	scheduleButton.click();
    	
    	Thread.sleep(5000);
    	
    	WebElement confirmSchedule = driver.findElement(By.xpath("//*[@id=\"details_tab_div\"]/div/div[1]/a[1]"));
      	 
    	confirmSchedule.click();
    	
    	Thread.sleep(5000);
 	
    } 
    
    public void newCampaignSchedulePriority() throws InterruptedException{
    	
    	WebElement schedulepriority = driver.findElement(By.xpath("//*[@id=\"campaign_send_at\"]"));
    	
    	// WebElement schedulepriority = driver.findElement(By.xpath("//*[@id=\"campaign_schedule\"]/div[1]/label"));
    	
    	schedulepriority.sendKeys("January 01, 2018 12:00 AM");
    	
    	Thread.sleep(5000);
  
    	WebElement scheduleButton = driver.findElement(By.linkText("Schedule"));
     	 
    	scheduleButton.click();
    	
    	Thread.sleep(5000);
    	
    	WebElement confirmSchedule = driver.findElement(By.xpath("//*[@id=\"details_tab_div\"]/div/div[1]/a[1]"));
      	 
    	confirmSchedule.click();
    	
    	Thread.sleep(5000);
    } 
    
    public void newCampaignSchedulePriorityWithoutDate() throws InterruptedException{
    	
    	WebElement schedulepriority = driver.findElement(By.xpath("//*[@id=\"campaign_schedule\"]/div[1]/label"));
    	
    	schedulepriority.click();
    	
    	Thread.sleep(5000);
  
    	WebElement scheduleButton = driver.findElement(By.linkText("Schedule"));
     	 
    	scheduleButton.click();
    	
    	Thread.sleep(5000);
    	
    	WebElement confirmSchedule = driver.findElement(By.xpath("//*[@id=\"details_tab_div\"]/div/div[1]/a[1]"));
      	 
    	confirmSchedule.click();
    	
    	Thread.sleep(5000);
 	
    } 

    public void deleteCampaign() throws InterruptedException{
    	
    	WebElement clickcampaign = driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a"));
    	
    	clickcampaign.click();
    	
    	Thread.sleep(5000);
    	
    	WebElement deletecampaign = driver.findElement(By.linkText("Delete"));
    	
    	deletecampaign.click();
    	
    	Thread.sleep(1000);
    	
    	this.click();
        
        Thread.sleep(2000);
 	
    } 
  
    public void clickNewABCampaignOption() throws InterruptedException{     
        
    	WebElement Campaign = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/ul/li[1]/a"));

    	Campaign.click();
    	
    	WebElement newABCampaign = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[2]/div/div[2]/div/a[2]"));
    	
    	newABCampaign.click();
    	
    	/*
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        WebElement menuOption = driver.findElement(By.linkText("New A/B Campaign"));
        
        menuOption.click();
    	*/
    }

    public void enterNewABCampaignDetails(String strCampaignName, String strFromEmail, String strReplyTo) throws InterruptedException{     
        
    	Thread.sleep(3000);
    	
    	this.enterCampaignName(strCampaignName);
    
    	Thread.sleep(3000);
    	
    	this.enterFromEmail(strFromEmail);
        
    	Thread.sleep(3000);
    
    	this.enterReplyTo(strReplyTo);
    
    	Thread.sleep(3000);
    	
    	// Select list option
    	
    	WebElement list = driver.findElement(By.id("list_24432"));
    	 
    	list.click();
    	
    	Thread.sleep(2000);
    }	
    
    public void newABCampaignNextButton() throws InterruptedException{     
	    
    	// Click on next button
        
    	WebElement next = driver.findElement(By.xpath("//*[@id=\"ab_step_1_next_btn\"]"));
   	 
    	next.click();
    	
    	Thread.sleep(10000);
    }	
    
    public void newABCampaignGroupSelection(String strGroupAContent, String strGroupBContent) throws InterruptedException{     
	    
    	this.enterGroupAContent(strGroupAContent);
    	
    	Thread.sleep(3000);
    	
    	this.enterGroupBContent(strGroupBContent);
    	
    	Thread.sleep(3000);
    }	
  
    public void newABCampaignScheduleButton() throws InterruptedException{     
	    
    	// Click on schedule button
        
    	WebElement schedule = driver.findElement(By.xpath("//*[@id=\"ab_step_2\"]/input[2]"));
   	 
    	schedule.click();
    	
    	Thread.sleep(5000);
    }	

    /*
    public void clickOnNameUnderCampaign() throws InterruptedException{    
    	
    	WebElement nameCampaign = driver.findElement(By.linkText("AA"));
        
        nameCampaign.click(); 
      
        WebElement Campaign = driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a"));
        
        Campaign.click(); 
    }   
    
    public void clickOnSignOutOption() throws InterruptedException{     
        
    	WebElement element = driver.findElement(By.linkText("Jatin Goel"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        WebElement menuOption = driver.findElement(By.linkText("Sign Out"));
        
        menuOption.click();
    
    }*/
}