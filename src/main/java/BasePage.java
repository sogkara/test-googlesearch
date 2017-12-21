import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver webdriver) {

        this.driver = webdriver;
    }

    public void visit (String url){

        driver.get(url);
    }
    public WebElement find (By locator){
        return driver.findElement(locator);
    }

    public void Clicik(By locator){
            find(locator).click();
    }

    public void Click(WebElement element){

        element.click();
    }

    public void type(By locator, String text){

        type(find(locator), text);
    }

    public void type (WebElement element, String text){

        element.sendKeys(text);
    }

    public WebElement find (String cssSelector){

        return find(By.cssSelector(cssSelector));
    }

    public void click1(String cssSelector){
        Click(find(cssSelector));
    }

    public void typeWithcss( String cssselector , String text){

        type(find(cssselector), text);
    }

    public boolean isDisplay(WebElement element, Integer timeout) {
        try {
            WebDriverWait wait =new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {

            return false;
        }
        return true;
    }
    public boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException  e) {

            return false;
        }


    }


    public boolean isDisplay1(By locator){
        return isDisplayed(find(locator));
      }

      public boolean isDisplay2 (String cssSelector){
        return isDisplayed(find(cssSelector));
      }
      public List<WebElement>findElements(By locator){
          return driver.findElements(locator);
      }

}
