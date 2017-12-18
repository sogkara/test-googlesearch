import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage  extends BasePage{

private By searchinput = By.cssSelector("input#lst-ib");
private  By seearchbutton = By.cssSelector("input[name='btnK']");

   public GoogleSearchpage(WebDriver webdriver) {
      super(webdriver);
      visit("Google.com");
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
}
