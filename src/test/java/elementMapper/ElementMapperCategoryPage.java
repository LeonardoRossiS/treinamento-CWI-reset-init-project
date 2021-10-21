package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMapperCategoryPage {

    @FindBy(className = "cat-name")
    public WebElement catName;

    @FindBy(css = ".product-container")
    public WebElement productContainer;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreProductPage;
}
