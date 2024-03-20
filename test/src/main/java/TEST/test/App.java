package TEST.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	 
        // Maximize the browser
        driver.manage().window().maximize();
 
       
        driver.get("https://www.geeksforgeeks.org/");
    }
}
