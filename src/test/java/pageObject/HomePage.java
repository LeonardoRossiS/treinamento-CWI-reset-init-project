package pageObject;

import elementMapper.ElementMapperHomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends ElementMapperHomePage {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Clicar no botão login")
    public void clickButtonSignIn(){
        login.click();
    }

    @Step("Acessar categoria")
    public void clickCategoryTShirts(){ categoryTShirts.click(); }
}
