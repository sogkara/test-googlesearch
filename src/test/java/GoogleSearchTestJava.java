import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTestJava {
    private GoogleSearchPage googlesearch;
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Studentb\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        googlesearch = new GoogleSearchPage(driver);
        }

        @Test
        public void test(){
          googlesearch.search("Armenia");
         String a= googlesearch.getFirstResult().getText();
         Assert.assertTrue(a.contains("Wikipedia"));
        }

       // @AfterMethod
   // public void quite(){

          //  driver.close();
      //  }



}
