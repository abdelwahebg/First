
package org.agueddidi.selenium.GoogleSearch;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleSearch {
	public static void main(String[] args) throws Exception {
                System.out.println("  Test Start  ");
        //not yet complet try to use this https://github.com/Ardesco/Selenium-Maven-Template/blob/master/pom.xml
	//to do ===> http://www.software-testing-tutorials-automation.com/2015/04/data-driven-test-using-csv-file-in.html
        System.setProperty("webdriver.gecko.driver", "/mnt/geckodriver11");
        //local gecko path (linux path)
    	FirefoxDriver FF = new FirefoxDriver();
        GoogleSearch.runURL(FF);   
       //local chrome webdrive path
        System.setProperty("webdriver.chrome.driver", "/mnt/chromedriver");
        ChromeDriver Chr = new ChromeDriver();
        GoogleSearch.runURL(Chr);
        System.out.println("End of run");
        }
        //Test instructions
	private static void runURL(WebDriver rwd) {
	    rwd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    rwd.get("https://www.google.tn/?gws_rd=cr&ei=BLFqWNv1OMiVaMX2i8gE");
            rwd.findElement(By.id("lst-ib")).click();
	    rwd.findElement(By.id("lst-ib")).clear();
	    rwd.findElement(By.id("lst-ib")).sendKeys("Selenuim Samples");
	    rwd.findElement(By.id("lst-ib")).click();
	    rwd.findElement(By.id("lst-ib")).sendKeys("\n");
	    rwd.quit();
		
	}

	}
