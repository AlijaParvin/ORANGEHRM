package Pages;

import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends PageObject {



    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement user_name;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement submit_button;


    public Login() {

        PageFactory.initElements(this.driver, this);
    }



    public void enterUserName(String un){
        user_name.sendKeys(un);}


    public void enterPassword(String pw){
        password.sendKeys(pw);}

    public void pressSubmitButton(){
        submit_button.click();
    }
}



