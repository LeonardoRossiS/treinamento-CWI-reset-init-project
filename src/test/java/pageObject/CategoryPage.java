package pageObject;

import elementMapper.ElementMapperCategoryPage;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends ElementMapperCategoryPage {

    public CategoryPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this); }

    public String getCatName(){return catName.getText();}

    @Step("Entrar na página do produto")
    public void clickProduct(){
        BasePage.mouseOver(productNameCategory);
        buttonMoreProductPage.click();
    }
    public String getProductNameCategory(){return productNameCategory.getText();}
}
