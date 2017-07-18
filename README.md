			Selenium Documentation Steps


How to Download & Install Selenium WebDriver

Step 1 - Install Java on your computer
Download and install the Java Software Development Kit (JDK) here.


Next –

This JDK version comes bundled with Java Runtime Environment (JRE), so you do not need to download and install the JRE separately.

Step 2 - Install Eclipse IDE
Download "Eclipse IDE for Java Developers" here. Be sure to choose correctly between Windows 32 Bit and 64 Bit versions.



You should be able to download an exe file named "eclipse-inst-win64"


Double-click on file to Install the Eclipse. A new window will open. Click Eclipse IDE for Java Developers.


After that, a new window will open which click button marked 1 and change path to "C:\eclipse". Post that Click on Install button marked 2


After successful completion of the installation procedure, a window will appear. On that window click on Launch


This will start eclipse neon IDE for you.

Step 3 - Download the Selenium Java Client Driver
You can download the Selenium Java Client Driver here. You will find client drivers for other languages there, but only choose the one for Java.


This download comes as a ZIP file named "selenium-2.25.0.zip". For simplicity, extract the contents of this ZIP file on your C drive so that you would have the directory "C:\selenium-2.25.0\". This directory contains all the JAR files that we would later import on Eclipse.

Step 4 - Configure Eclipse IDE with WebDriver
	
1	Launch the "eclipse.exe" file inside the "eclipse" folder that we extracted in step 2. If you followed step 2 correctly, the executable should be located on C:\eclipse\eclipse.exe.
	
2	When asked to select for a workspace, just accept the default location.

 
3. Create a new project through File > New > Java Project. Name the project as “newproject".



A new pop-up window will open enter details as follow
	1	Project Name
	2	Location to save project
	3	Select an execution JRE
	4	Select layout project option
	5	Click on Finish button


4. In this step,
	1	Right-click on the newly created project and
	2	Select New > Package, and name that package as “newpackage".



A pop-up window will open to name the package,
	1	Enter the name of the package
	2	Click on Finish button


5. Create a new Java class under newpackage by right-clicking on it and then selecting- New > Class, and then name it as "MyClass". Your Eclipse IDE should look like the image below.



When you click on Class, a pop-up window will open, enter details as
	1	Name of the class
	2	Click on Finish button


This is how it looks like after creating class.


Now selenium WebDriver's into Java Build Path
In this step,
	1	Right-click on "newproject" and select Properties.
	2	On the Properties dialog, click on "Java Build Path".
	3	Click on the Libraries tab, and then
	4	Click on "Add External JARs..”



When you click on "Add External JARs.." It will open a pop-up window. Select the JAR files you want to add.


After selecting jar files, click on OK button.


6. Add all the JAR files inside and outside the "libs" folder. Your Properties dialog should now look similar to the image below.



7. Finally, click OK and we are done importing Selenium libraries into our project.

———————————————————————————————————————————————————————

				Maven & TestNG Steps

Step1) In Eclipse IDE, select Help | Install New Software from Eclipse Main Menu.

Step 2) On the Install dialog, select Work with and m2e plugin as shown in the following screenshot:


Step 3)Click on Next button and finish installation.

Configure Eclipse with Maven
With m2e plugin is installed, we now need create Maven project.
Step 1) In Eclipse IDE, create a new project by selecting File | New | Other from Eclipse menu.
Step 2) On the New dialog, select Maven | Maven Project and click Next


Step 3) On the New Maven Project dialog select the Create a simple project and click Next



Step 4) Enter WebdriverTest in Group Id: and Artifact Id: and click finish


Step 5) Eclipse will create WebdriverTest with following structure:


Step 6) Right-click on JRE System Library and select the Properties option from the menu.


On the Properties for JRE System Library dialog box, make sure Workspace default JRE is selected and click OK



Step 7). Select pom.xml from Project Explorer..
 

 
pom.xml file will Open in Editor section


Step 8) Add the Selenium, Maven, TestNG, Junit dependencies to pom.xml in the <project> node:

	<dependencies>			
        <dependency>				
             <groupId>junit</groupId>								
             <artifactId>junit</artifactId>								
             <version>3.8.1</version>								
             <scope>test</scope>								
        </dependency>				
        <dependency>				
            <groupId>org.seleniumhq.selenium</groupId>								
            <artifactId>selenium-java</artifactId>								
            <version>2.45.0</version>								
		</dependency>				
        <dependency>				
            <groupId>org.testng</groupId>								
            <artifactId>testng</artifactId>								
            <version>6.8</version>								
            <scope>test</scope>							  			
       </dependency>				
</dependencies>

Step 9) Create a New TestNG Class. Enter Package name as "example" and "NewTest" in the Name: textbox and click on the Finish button as shown in the following screenshot:


Step 10). Eclipse will create the NewTest class as shown in the following screenshot:



Step 11) Add the following code to the NewTest class:
This code will verify the title of Guru99 Selenium Page

package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	

Step 12) Right-click on the WebdriverTest and select TestNG | Convert to TestNG. 
Eclipse will create testng.xml which says that you need to run only one test with the name NewTest as shown in the following screenshot:


Update the project and make sure that file appears in the tree Package Explorer (right click on the project - Refresh).


Step 13) Now you need to run test through this testng.xml.
So, go to the Run Configurations and create a new launch TestNG, select the project and field Suite as testng.xml and click Run


Make sure that build finished successfully.

Step 14). Additionally, we need to add
	1	maven-compiler-plugin
	2	maven-surefire-plugin
	3	testng.xml
to pom.xml.
The maven-surefire-plugin is used to configure and execute tests. Here plugin is used to configure the testing.xml for TestNG test and generate test reports.
The maven-compiler-plugin is used to help in compiling the code and using the particular JDK version for compilation. Add all dependencies in the following code snippet, to pom.xml in the <plugin> node:



Step 15) To run the tests in the Maven lifecycle, Right-click on the WebdriverTest and select Run As | Maven test. Maven will execute test from the project.


Make sure that build finished successfully.

——————————————————————————————————————————————————————-


We have a test 'verifyGooglePageTitle()' in the above class. Below is the testng.xml file which we will include in pom.xml file.

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Example test run">
  <test name="Simple Test">
    <classes>
      <class name="com.google.tests.GoogleHomePageTest"/>
    </classes>
  </test>
</suite>

After adding all the dependencies, we need to add the classes that we want to execute. And below is the pom.xml file looks like.
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>FirstDemo</groupId>
	<artifactId>FirstDemo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<properties>
		<jre.level>1.7</jre.level>
		<jdk.level>1.7</jdk.level>
	</properties>

	<build>
		<plugins>
			<!-- Compiler plug-in -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>${jdk.level}</source>
					<target>${jdk.level}</target>
				</configuration>
			</plugin>
			<!-- Below plug-in is used to execute tests -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.18.1</version>
				<configuration>
					<suiteXmlFiles>
						<!-- TestNG suite XML files -->
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<!-- Include the following dependencies -->
	<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>2.45.0</version>
		</dependency>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.8.8</version>
		</dependency>
	</dependencies>

</project>

After executing the above program, the report will be generated in your project folder under target\surefire-reports. You can checkout default testng html reports.


                      
