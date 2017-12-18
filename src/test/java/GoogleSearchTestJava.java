import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTestJava {
    private GoogleSearchpage googlesearch;
    private ChromeDriver driver;



    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Studentb\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        googlesearch = new GoogleSearchpage(driver);
    }

    @Test
    public void search(){

        googlesearch.search("Armenia");

    }










    @After
    public void tearDown(){

        driver.quit();
        driver.close();

    }


}
