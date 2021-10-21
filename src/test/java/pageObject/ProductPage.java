package pageObject;

import elementMapper.ElementMapperProductPage;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ElementMapperProductPage {

    public ProductPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this); }

    public String getProductNamePP(){return productNamePP.getText(); }
    @Step("Adiciona o produto ao carrinho")
    public void clickAddToCartPP(){addToCartPP.click();}
    @Step("Avança para o Checkout")
    public void clickButtonModalProceedToCheckout(){buttonModalProceedToCheckout.click();}
}
