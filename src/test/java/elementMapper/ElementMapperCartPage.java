package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMapperCartPage {

    @FindBy(css = ".cart_description .product-name")
    public WebElement productNameCart;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    public WebElement proceedButton1;
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
    public WebElement proceedButton3;
    @FindBy(xpath = "//*[@id=\"form\"]/p/button")
    public WebElement proceedButton4;
    public WebElement cgv;
    @FindBy(css = ".bankwire")
    public WebElement bankwire;
    @FindBy(css = ".button[type='submit']")
    public WebElement confirmOrder;
    @FindBy(css = ".cheque-indent .dark")
    public WebElement completeOrder;
}
