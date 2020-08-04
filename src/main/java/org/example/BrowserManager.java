package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import javax.print.DocFlavor;
import java.lang.reflect.MalformedParametersException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
   public static  LoadProp loadProp = new LoadProp();
    boolean soucelab = Boolean.parseBoolean(loadProp.getProperty("saucelab"));

    public static final String USERNAME = loadProp.getProperty("USERNAME");//"krunal1";
    public static final String ACCESS_KEY =loadProp.getProperty("ACCESSKEY");
   //public static final String URL ="http://"+userName+":"+ACCESS_KEY+"@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    //public static final String URL="https://krunal1:da54e79c-ef66-4dbc-9014-04554f7bb0d4@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    public static final String URL="https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.us-west-1.saucelabs.com:443/wd/hub";
     public void setBrowser()
    {
        String browser = loadProp.getProperty("browser");
        if(soucelab) {
            System.out.println("Testcases is running in soucelab .....................");
            //running in remote chrome browser
            if (browser.equalsIgnoreCase("chrome")) {
                MutableCapabilities sauceOptions = new MutableCapabilities();
                //DesiredCapabilities caps = DesiredCapabilities.chrome();
                ChromeOptions caps = new ChromeOptions();
               // caps.setExperimentalOption("w3c", true);
                caps.setCapability("platformName", "Windows 10");
                caps.setCapability("browserVersion", "81.0");
                caps.setCapability("sauce:options", sauceOptions);

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }//running in remote IE browser
            else if (browser.equalsIgnoreCase("IE"))
            {
                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                //InternetExplorerOptions browserOptions = new InternetExplorerOptions();
               caps.setCapability("platformName", "Windows 8.1");
               caps.setCapability("browserVersion", "11.0");
                //browserOptions.setCapability("sauce:options", sauceOptions);

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            //running testcases in remote firefox browser
            else if(browser.equalsIgnoreCase("firefox"))
            {
                MutableCapabilities sauceOptions = new MutableCapabilities();

                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 8.1");
                browserOptions.setCapability("sauce:options", sauceOptions);
//                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//               //FirefoxOptions browserOptions = new FirefoxOptions();
//                caps.setCapability("platformName", "Windows 10");
//                caps.setCapability("browserVersion", "79.0");
//                //browserOptions.setCapability("sauce:options", sauceOptions);

                try {
                    driver = new RemoteWebDriver(new URL(URL),browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            //running testcases in remote safari browser
            else if(browser.equalsIgnoreCase("safari"))
            {
                MutableCapabilities sauceOptions = new MutableCapabilities();

                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setCapability("platformName", "macOS 10.15");
                browserOptions.setCapability("browserVersion", "13.1");
                browserOptions.setCapability("sauce:options", sauceOptions);

                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("you have enter wrong browser");
            }
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        }
        else {//running in local chrome browser
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
            }//running in local IE browser
            else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\drivers\\IEDriverServer1.exe");
                //creating chrome driver object to open chrome browser
                driver = new InternetExplorerDriver();
                DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();

                ieCapabilities.setCapability("nativeEvents", false);
                ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
                ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
                ieCapabilities.setCapability("disable-popup-blocking", true);
                ieCapabilities.setCapability("enablePersistentHover", true);

                driver = new InternetExplorerDriver(ieCapabilities);
            }//running in local firefox driver
            else if (browser.equalsIgnoreCase("firefox")) {
                //seting up firfoxedriver path
                System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\drivers\\geckodriver.exe");
                //creating chrome driver object to open chrome browser
                driver = new FirefoxDriver();
            } else //if enter wrong browser name
            {

                System.out.println("you have enter wrong browser");
            }
        }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

    }
    public void closeBrowser()
    {
        driver.close();
    }
}
