package pageObject;

import elementMapper.ElementMapperLogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class LogInPage extends ElementMapperLogInPage {

    public LogInPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Preenchemos o e-mail")
    public void fillEmail(){email.sendKeys(Utils.getLoginEmail());}
    @Step("Preenchemos a senha")
    public void fillPassword(){passwd.sendKeys(Utils.getLoginPassword());}
    @Step("Clicamos em Sign In")
    public void clickSubmitLogin(){SubmitLogin.click();}

}
