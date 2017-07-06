package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MaropostEmailContentsPage {

	WebDriver driver;
    
    By useremail = By.id("user_email");

    By userpassword = By.id("user_password");

    By signin = By.name("commit");

    By signout = By.xpath("/html/body/header/div/nav/ul/li[7]/a");
    
    public MaropostEmailContentsPage(WebDriver driver) throws InterruptedException{

        this.driver = driver;
        
        Thread.sleep(3000);  
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
        
        Thread.sleep(3000);
        
        //Fill password

        this.setUserPassword(strPasword);

        Thread.sleep(3000);
        
        //Click Login button

        this.clickLogin(); 
        
        Thread.sleep(10000);
       
    }
    
    public void clickNewContentOption() throws InterruptedException{     
        
    	WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[6]/a"));
        
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        WebElement menuOption = driver.findElement(By.linkText("New Content"));
        
        menuOption.click();
    
    }
}
