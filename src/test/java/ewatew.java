import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class ewatew {

    public static void main(String[] args) {
        Logger log = Logger.getLogger("ewatew");
        BrowserDriverFactory factory = new BrowserDriverFactory(log);
        WebDriver driver = factory.createChromeDriver();
        driver.get("https://www.expedia.com");
    }

    public static class BrowserDriverFactory {

        private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
        private Logger log;

        public BrowserDriverFactory(Logger log) {
            this.log = log;
        }

        public WebDriver createChromeDriver() {
        }


        public class browserDriverFactory {

            private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
            private Logger log;

            public browserDriverFactory(Logger log) {
                this.log = log;
            }


            public WebDriver createChromeDriver() {
                // Create driver
                log.info("Create driver");
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver());
                return driver.get();
            }
        }


    }
}
