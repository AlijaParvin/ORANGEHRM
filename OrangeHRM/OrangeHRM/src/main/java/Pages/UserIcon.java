package Pages;

import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserIcon extends PageObject {

    @FindBy(xpath = "//a[text()='Welcome opensourcecms']")
    WebElement click_icon;
    @FindBy(xpath = "//a[@id='aboutDisplayLink']")
    WebElement click_about;
    @FindBy(xpath = "(//a[@class='close'])[1]")
    WebElement close_button;

    public UserIcon() {

        PageFactory.initElements(this.driver, this);
    }

    public void pressIcon(){
        jsClick(click_icon);
    }
    public void pressAbout(){
        jsClick(click_about);
    }
    public void pressCloseButton(){
        jsClick(close_button);
    }
}
