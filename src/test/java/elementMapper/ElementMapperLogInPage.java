package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMapperLogInPage {

    public WebElement email;
    public WebElement passwd;
    public WebElement SubmitLogin;
    @FindBy(id = "email_create")
    public WebElement emailCreate;
    @FindBy(id = "SubmitCreate")
    public WebElement submitCreate;
    @FindBy(id = "id_gender2")
    public WebElement buttonGender;
    public WebElement customer_firstname;
    public WebElement customer_lastname;
    public WebElement address1;
    public WebElement city;
    public WebElement id_state;
    public WebElement postcode;
    public WebElement phone_mobile;
    public WebElement submitAccount;

}
