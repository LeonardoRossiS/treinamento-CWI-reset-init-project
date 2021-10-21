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

    @Step("Preenche o e-mail")
    public void fillEmail(){email.sendKeys(Utils.getLoginEmail());}
    @Step("Preenche a senha")
    public void fillPassword(){passwd.sendKeys(Utils.getLoginPassword());}
    @Step("Clica em Sign In")
    public void clickSubmitLogin(){SubmitLogin.click();}
    @Step("Gera um e-mail aleatório")
    public void fillNewEmail(){emailCreate.sendKeys(Utils.getRandomEmail());}
    @Step("Clica em 'Create an account'")
    public void clickSubmitCreate(){submitCreate.click();}
    @Step("Preenche o registro e completa o registro")
    public void fillRegister(){
        buttonGender.click();
        customer_firstname.sendKeys("Teste");
        customer_lastname.sendKeys("Teste");
        passwd.sendKeys("teste123");
        address1.sendKeys("street street");
        city.sendKeys("cidade");
        id_state.sendKeys("Iowa");
        postcode.sendKeys("12343");
        phone_mobile.sendKeys("99852123");
        submitAccount.click();
    }


}
