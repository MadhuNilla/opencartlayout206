import org.junit.Test;
import org.slf4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;


public class SampleLog {

    private static final Logger LOGGER= LoggerFactory.getLogger(SampleLog.class);

      @Test
      public void callLog()
      {
        LOGGER.debug("opening the browser");
        WebDriver driver=new ChromeDriver();
        //PropertyConfigurator.configure("log4j.properties");
        LOGGER.debug("opening the url");
        driver.get("https://www.youtube.com");


    }


}
