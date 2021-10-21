package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMapperCartPage {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;
}
