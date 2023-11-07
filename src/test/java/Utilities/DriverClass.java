package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverClass {
    //private static WebDriver driver;
    //Thread = Threads allows a program to operate more efficiently by doing multiple things at the same time.

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> browserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (browserName.get()==null){
            browserName.set("chrome");
        }
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        if (threadDriver.get() == null) {
            switch (browserName.get()){
                case "chrome":

                    ChromeOptions options = new ChromeOptions();
                    if (!runningOnIntelliJ()){
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                    }
                    threadDriver.set(new ChromeDriver(options));
                    break;
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
            }
//            Logger logger = Logger.getLogger("");
//            logger.setLevel(Level.SEVERE);
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        //return driver;
        threadDriver.get().manage().window().maximize();
        threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        return threadDriver.get();
    }

    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }

        if(threadDriver.get()!=null){
            threadDriver.get().quit();
            threadDriver.set(null);
        }
    }

    public static void setBrowserName(String browser){
        browserName.set(browser.toLowerCase());
    }

    public static boolean runningOnIntelliJ(){ // checks if the test is being run by intellij
        String classpath = System.getProperty("java.class.path");
        return classpath.contains("idea_rt.jar");

    }
}
