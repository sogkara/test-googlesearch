import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestClcik {

    private loading load;
    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Studentb\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        load = new loading(driver);
    }
     @Test
    public void ClickMyButton (){
        load.clickbutton();
        assertTrue(load.isFinishedDisplayed()) ;
        assertEquals(load.getFinish().getText(), "Hello World!");
}




}
