import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.testng.annotations.DataProvider;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class TestUtilities extends BaseTest {

        // STATIC SLEEP
        protected void sleep(long millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        @DataProvider(name = "files")
        protected static Object[][] files() {
            return new Object[][] {
                    { 1, "index.html" },
                    { 2, "logo.png" },
                    { 3, "text.txt" }
            };
        }


        /** Get logs from browser console */
        protected List<LogEntry> getBrowserLogs() {
            int driver = getDriver();
            LogEntries log = driver.manage().logs().get("browser");
            List<LogEntry> logList = log.getAll();
            return logList;
        }

    private int getDriver() {
   


    /** @param departureDate "MM/dd/yyyy" */
        protected int getDaysToDate(String String departureDate = null) {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

            Calendar now = Calendar.getInstance();
            now.setTime(new Date()); // Now use today date.

            Calendar departure = new GregorianCalendar();
            Date date = null;
            try {
                date = sdf.parse(departureDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            departure.setTime(date);
            int days = (int) ((departure.getTime().getTime() - now.getTime().getTime()) / (1000 * 60 * 60 * 24));

            return days + 1;
        }
        String departureDate1 = departureDate;
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

            Calendar now = Calendar.getInstance();
            now.setTime(new Date()); // Now use today date.

            Calendar departure = new GregorianCalendar();
            Date date = null;
            try {
                date = sdf.parse(departureDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            departure.setTime(date);
            int days = (int) ((departure.getTime().getTime() - now.getTime().getTime()) / (1000 * 60 * 60 * 24));

            return days + 1;
        }
    }



