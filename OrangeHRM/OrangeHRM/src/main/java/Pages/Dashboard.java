package Pages;

import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends PageObject {



    @FindBy(xpath = "//span[text()='Assign Leave']")

    WebElement leave_button;



    public Dashboard() {

        PageFactory.initElements(this.driver, this);
    }


    public void pressLeaveButton() {

        leave_button.click();
    }
}




