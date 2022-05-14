package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//THIS IS JUST AN EXAMPLE - NOT REALLY USED IN THE REAL WORLD BUT JUST TO SHOW 
//THIS CAN BE DONE WITH JAVA

public class LaunchChrome extends abc{

	public static void main(String[] args) throws InterruptedException {
		//Set Property
		System.setProperty("webdriver.chrome.driver", "/Users/guest1/Desktop/TechFios/DEC2021/SELENIUM/1st_Selenium/drivers/chromedriver");
		
		//Obejct create of WebsDRiver
		WebDriver driver = new ChromeDriver(); //  Polymorphsis concept (OOPS of java) :: WebDriver is the interface and ChromeDriver is the feedback
												// Object variable
		//Go to Website
		driver.get("http://www.google.com"); //.get is a method and the argument is the website
		
		//Maxamize Browser
		driver.manage().window().maximize();
		
		//Stop exectuion
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();
		
		
		
		
		// Different methods of calling different variables from another class
		//Object creation
		 abc obj = new abc();

		//obj.a; // java give us the option to call something from different class
		 
		//inherit  // to be static method to call it //static - access modifier
		 
		 staticMethod();
	
		//by class name
		//abc.
	}
	
}
