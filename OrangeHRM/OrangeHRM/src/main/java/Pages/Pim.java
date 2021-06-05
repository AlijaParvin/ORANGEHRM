package Pages;

import Base.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim extends PageObject {


    @FindBy(xpath = "//b[text()='PIM']")
    WebElement pim;
    @FindBy(xpath = "//a[text()='Employee List']")
    WebElement employee_list;
    @FindBy(xpath = "//a[text()='Reports']")
    WebElement reports;

    public Pim() {

        PageFactory.initElements(this.driver, this);
    }


    public void pressPim(){
        jsClick(pim);
    }
    public void pressListButton(){
        jsClick(employee_list);
    }
    public void pressReports(){
        jsClick(reports);
    }


}
