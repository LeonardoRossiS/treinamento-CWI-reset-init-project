package pageObject;

import elementMapper.ElementMapperLogInPage;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class LogInPage extends ElementMapperLogInPage {

    public LogInPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void fillEmail(){email.sendKeys(Utils.getLoginEmail());}
    public void fillPassword(){passwd.sendKeys(Utils.getLoginPassword());}
    public void clickSubmitLogin(){SubmitLogin.click();}

}
