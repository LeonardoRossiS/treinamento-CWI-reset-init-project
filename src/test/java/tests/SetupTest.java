package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

import static org.junit.Assert.assertTrue;
@Feature("Testes em site de e-commerce")
public class SetupTest extends BaseTest{

    @Test
    @Story("Abrir o site")
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseURL()));
        System.out.println("Abrimos o navegador e carregamos a URL");
    }

    @Test
    @Story("Realizar o login")
    public void testLogIn(){
        HomePage home = new HomePage();
        LogInPage login = new LogInPage();

        home.clickButtonSignIn();
        //assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getLoginURL()));
        //System.out.println("Acessamos a página de login");
        login.fillEmail();
        //System.out.println("Preenchemos o e-mail");
        login.fillPassword();
        //System.out.println("Preenchemos a senha");
        login.clickSubmitLogin();
        //System.out.println("Clicamos em Sign In");

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getMyAccountURL()));
        //System.out.println("Validou a URL da página do usuário");
        //assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
        //        .getText().contains("MY ACCOUNT"));
        //System.out.println("Confirmamos o heading da página do usuário");
    }

    @Test
    @Story("Acessar categoria")
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
    @Story("Entrar na página do produto")
    public void testEnterProductPage(){
        testAcessCategoryTShirts();

        CategoryPage category = new CategoryPage();
        ProductPage product = new ProductPage();

        String productNameCategory = category.getProductNameCategory();

        category.clickProduct();

        assertTrue(product.getProductNamePP().equals(productNameCategory));
    }

    @Test
    @Story("Adicionar produto ao carrinho, da página do produto")
    public void testAddProductToCartPP(){
        testEnterProductPage();

        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        String productNamePP = product.getProductNamePP();

        product.clickAddToCartPP();
        product.clickButtonModalProceedToCheckout();
        assertTrue(cart.getProductNameCart().equals(productNamePP));
    }

    @Test
    @Story("Fluxo de criação de conta de um usuário")
    public void criaConta(){
        HomePage home = new HomePage();
        LogInPage login = new LogInPage();

        home.clickButtonSignIn();
        login.fillNewEmail();
        login.clickSubmitCreate();
        login.fillRegister();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getMyAccountURL()));
    }

    @Test
    @Story("Fluxo automatizado de compra")
    public void fluxoCompra(){
        String cat = "T-SHIRTS";

        HomePage home = new HomePage();
        LogInPage login = new LogInPage();
        CategoryPage category = new CategoryPage();
        ProductPage product = new ProductPage();
        CartPage cart = new CartPage();

        home.clickButtonSignIn();
        login.fillEmail();
        login.fillPassword();
        login.clickSubmitLogin();
        Browser.getCurrentDriver().findElement(By.linkText(cat)).click();
        String productNameCategory = category.getProductNameCategory();
        category.clickProduct();
        product.clickAddToCartPP();
        product.clickButtonModalProceedToCheckout();
        //assertTrue(cart.getProductNameCart().equals(productNameCategory));
        cart.clickProceed1();
        cart.clickProceed3();
        cart.clickAgree();
        cart.clickProceed4();
        cart.payByBank();
        cart.submitOrder();
        assertTrue(cart.getConfirmOrder().equals("Your order on My Store is complete."));
    }
}
