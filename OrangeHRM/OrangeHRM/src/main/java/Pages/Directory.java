package Pages;

import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Directory extends PageObject {

    @FindBy(xpath = "//b[text()='Directory']")
    WebElement directory;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement search_button;

    public Directory() {

        PageFactory.initElements(this.driver, this);
    }

    public void pressDirectory(){
        jsClick(directory);
    }
    public void pressSearch(){
        jsClick(search_button);
    }
}
