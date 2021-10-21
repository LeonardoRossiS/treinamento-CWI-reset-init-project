package pageObject;

import elementMapper.ElementMapperCartPage;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends ElementMapperCartPage {

    public CartPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this); }

    public String getProductNameCart(){return productNameCart.getText();}
    @Step("Avança no Checkout")
    public void clickProceed1(){proceedButton1.click();}
    @Step("Avança no Checkout")
    public void clickProceed3(){proceedButton3.click();}
    @Step("Avança no Checkout")
    public void clickProceed4(){proceedButton4.click();}
    @Step("Concorda com os termos e condições")
    public void clickAgree(){cgv.click();}
    @Step("Escolhe forma de pagamento (transferência bancária)")
    public void payByBank(){bankwire.click();}
    @Step("Termina o Checkout")
    public void submitOrder(){confirmOrder.click();}
    public String getConfirmOrder(){return completeOrder.getText();}
}
