package pageObject;

import elementMapper.ElementMapperProductPage;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ElementMapperProductPage {

    public ProductPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this); }

    public String getProductNamePP(){return productNamePP.getText(); }
    public void clickAddToCartPP(){addToCartPP.click();}
    public void clickButtonModalProceedToCheckout(){buttonModalProceedToCheckout.click();}
}
