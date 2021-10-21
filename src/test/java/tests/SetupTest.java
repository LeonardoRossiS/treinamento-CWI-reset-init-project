package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTest{
    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }
    @Test
    public void testLogIn(){
        HomePage home = new HomePage();
        home.clickButtonSignIn();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getLoginURL()));
        System.out.println("Acessamos a página de login");

        LogInPage login = new LogInPage();
        login.fillEmail();
        System.out.println("Preenchemos o e-mail");
        login.fillPassword();
        System.out.println("Preenchemos a senha");
        login.clickSubmitLogin();
        System.out.println("Clicamos em Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
                .contains(Utils.getMyAccountURL()));
        System.out.println("Acessamos a página do usuário");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
                .getText().contains("MY ACCOUNT"));
        System.out.println("Confirmamos o heading da página do usuário");

    }

    @Test
    public void testAcessCategoryTShirts(){
        //Categorias: "WOMEN" "DRESSES" "T-SHIRTS"
        String category = "T-SHIRTS";

        HomePage home = new HomePage();
        CategoryPage catTShirts = new CategoryPage();

        //home.clickCategoryTShirts();
        Browser.getCurrentDriver().findElement(By.linkText(category)).click();

        assertTrue(catTShirts.getCatName().contains(category));

    }

    @Test
    public void testEnterProductPage(){
        testAcessCategoryTShirts();

        CategoryPage category = new CategoryPage();
        ProductPage product = new ProductPage();

        String productNameCategory = category.getProductNameCategory();
        category.clickProduct();

        assertTrue(product.getProductNamePP().equals(productNameCategory));
    }

    @Test
    public void testAddProductToCartPP(){
        testEnterProductPage();

        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        String productNamePP = product.getProductNamePP();

        product.clickAddToCartPP();
        product.clickButtonModalProceedToCheckout();
        assertTrue(cart.getProductNameCart().equals(productNamePP));


    }
}
