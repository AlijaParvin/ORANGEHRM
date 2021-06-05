package Pages;

import Base.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin extends PageObject {


    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement user_management;
    @FindBy(xpath = "//a[@id='menu_admin_viewSystemUsers']")
    WebElement user;
    @FindBy(xpath = "//input[@name='btnAdd']")
    WebElement add;
    @FindBy(xpath = "//input[@maxlength='200']")
    WebElement employee_name;
    @FindBy(xpath = "//input[@maxlength='40']")
    WebElement user_name;
    @FindBy(xpath = "//input[@maxlenght='64']")
    WebElement pass_word;
    @FindBy(xpath = "//input[@maxlength='64']")
    WebElement confirm_password;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement save_button;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organization;
    @FindBy(xpath = "//a[text()='Structure']")
    WebElement structure;
    @FindBy(xpath = "//input[@id='btnEdit']")
    WebElement edit_button;
    @FindBy(xpath = "//a[@class='addButton']")
    WebElement add_button;
    @FindBy(xpath = "//input[@id='txtUnit_Id']")
    WebElement unitid;
    @FindBy(xpath = "//input[@id='txtName']")
    WebElement name;
    @FindBy(xpath = "//input[@value='Save']")
    WebElement save;
    @FindBy(xpath = "//input[@value='Done']")
    WebElement done_button;


    public Admin() {

        PageFactory.initElements(this.driver, this);
    }


    public void pressUserManagement(){
        jsClick(user_management);
    }
    public void pressUser(){
        jsClick(user);

    }
    public void pressAddButton(){
        jsClick(add);
    }
    public void enterEmployeeName(){
        employee_name.sendKeys("opensourcecms opensourcecms");
    }
    public void enterUserName(){ user_name.sendKeys("Abc@123"); }
    public void enterPassword(){
        pass_word.sendKeys("Orangehrm@12");
    }
    public void enterConfirmPassword(){
        confirm_password.sendKeys("Orangehrm@12");
    }
    public void pressSaveButton(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jsClick(save_button);
    }

    public void pressOrganization(){
        jsClick(organization);
    }
    public void pressStructure(){
        jsClick(structure);
    }
    public  void pressEdit(){
        jsClick(edit_button);
    }
    public void pressAdd(){
        jsClick(add_button);
    }
    public void enterUnitId(){
        unitid.sendKeys("Demo");
    }
    public void enterName(){
        name.sendKeys("Test");
    }
    public void pressSave(){
        jsClick(save);
    }
    public void pressDone(){
        jsClick(done_button);
    }
}
