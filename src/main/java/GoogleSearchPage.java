import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage extends BasePage{

private By searchinput = By.cssSelector("input#lst-ib");
private  By seearchbutton = By.cssSelector("input[name='btnK']");

   public GoogleSearchPage(WebDriver webdriver) {
      super(webdriver);
      visit("https://google.com");
   }

   public void clickSearchbytton(){

      Clicik(seearchbutton);
   }
   public void typesearchInput(String text){

      type(searchinput, text);
    }
   public void search(String text){
      typesearchInput(text);
      clickSearchbytton();
   }
   public WebElement getFirstResult() {
      List<WebElement> elements=findElements(By.cssSelector((".rc .r")));
      return elements.get(0);
   }
}
