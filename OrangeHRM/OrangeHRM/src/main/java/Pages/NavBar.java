package Pages;


import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBar extends PageObject
{

    @FindBy(xpath = "//b[text()='Admin']")
    WebElement admin;
    @FindBy(xpath = "//b[text()='Dashboard']")
    WebElement dashboard;


    public NavBar() {

        PageFactory.initElements(this.driver,this);
    }

    public Admin pressAdmin(){
        admin.click();
        return new Admin();
    }

    public Dashboard pressDashboard(){
        dashboard.click();
        return new Dashboard();
    }

}
