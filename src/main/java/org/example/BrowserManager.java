package org.example;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    LoadProp loadProp = new LoadProp();

    public  void SetBrowser()//(String browser) throws Exception
    { String browserName ="chrome";
        //Check if parameter passed from TestNG is 'firefox'
        if(browserName.equalsIgnoreCase("firefox"))
        {
            //create firefox instance
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'chrome'
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            //set path to chromedriver.exe

            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\BrowserDrivers\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            driver = new ChromeDriver(options);
        }else{
            //If no browser passed throw exception
            //throw new Exception("Browser is not correct");
            System.out.println("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    public void closingMethod(){
        driver.close();}
//System.setProperty("webdriver.chrome.driver", "src\\test\\resouces\\BrowserDrivers\\chromedriver.exe");
}
