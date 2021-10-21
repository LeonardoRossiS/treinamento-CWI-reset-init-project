package pageObject;

import elementMapper.ElementMapperHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends ElementMapperHomePage {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickButtonSignIn(){
        login.click();
    }
    public void clickCategoryTShirts(){ categoryTShirts.click(); }
}
