package pageObject;

import elementMapper.ElementMapperCartPage;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CartPage extends ElementMapperCartPage {

    public CartPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this); }

    public String getProductNameCart(){return productNameCart.getText();}
}
