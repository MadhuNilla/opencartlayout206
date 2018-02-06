//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.util.concurrent.TimeUnit;
//
//public class LoadBrowser extends AutomationConstraints {
//        public static WebDriver driver;
//
//        @BeforeClass
//        public static void openBrowser()
//
//        {
//            if (AutomationConstraints.BROWSER.equalsIgnoreCase("chrome")) {
//                System.out.println("opening the Browser");
//                System.setProperty("webdriver.chrome.driver", "chromedriver");
//                driver = new ChromeDriver();
//                driver.manage().timeouts().implicitlyWait(AutomationConstraints.TIMEOUT, TimeUnit.SECONDS);
//                driver.get(AutomationConstraints.URL);
//
//            } else if (AutomationConstraints.BROWSER.equalsIgnoreCase("firefox")) {
//                System.setProperty("webdriver.gecko.driver", "geckodriver");
//                driver = new FirefoxDriver();
//
//            } else
//                System.out.println("There is no browser to invoke");
//        }
//
//        @Test
//        public void loadUrl()
//        {
//            driver.get(AutomationConstraints.URL);
//        }
//
//        @AfterClass
//        public static void closeBrowser()
//        {
//            System.out.println("closing the browser");
//             driver.quit();
//        }
//
//    }
//
