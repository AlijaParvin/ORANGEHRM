package com.orangehrm;

import Base.PageObject;
import Pages.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Reports.LoggerReport;

public class TestPlan extends PageObject {


	static Dashboard dashboard;
	static NavBar navBar;
	static LoggerReport loggerReport;
	@BeforeTest
	
	public void setUp() {
		initialize();
		navBar = new NavBar();
		dashboard = new Dashboard();
		loggerReport = new LoggerReport();  
	
	}

	TestPlan() {
	}

@Test
	@Parameters({"username", "password"})
	public static void Login(String username, String password) {

		Login login;
		login = new Login();
		login.enterUserName(username);
		login.enterPassword(password);
		login.pressSubmitButton();
		//loggerReport.LOGGER.debug("Given Username name is {} and password is {}",username, password);
			
		
	
				
            

	}
   
	public static void CreateUser() {

		Admin admin;
		admin = new Admin();
		navBar.pressAdmin();
		admin.pressUserManagement();
		admin.pressUser();
		admin.pressAddButton();
		admin.enterEmployeeName();
		admin.enterUserName();
		admin.enterPassword();
		admin.enterConfirmPassword();
		admin.pressSaveButton();


	}

	public static void pressEmployeeListButton() {

		Pim pim;
		pim = new Pim();
		pim.pressPim();
		pim.pressListButton();

	}

	public static void ViewReports(){

		Pim pim;
		pim = new Pim();
		pim.pressReports();
	}

	public static void AssignLeave() {
		navBar.pressDashboard();
		dashboard.pressLeaveButton();


	}

	public static void EditOrganizationStructure(){

		navBar.pressDashboard();
		Admin admin;
		admin = new Admin();
		admin.pressOrganization();
		admin.pressStructure();
		admin.pressEdit();
		admin.pressAdd();
		admin.enterUnitId();
		admin.enterName();
		admin.pressSave();
		admin.pressDone();



	}



	public static void SearchDirectory(){

		Directory directory;
		directory = new Directory();
		navBar.pressDashboard();
		directory.pressDirectory();
		directory.pressSearch();

	}
	public static void ViewAbout(){

		UserIcon userIcon;
		userIcon = new UserIcon();
		userIcon.pressIcon();
		userIcon.pressAbout();
		userIcon.pressCloseButton();
		navBar.pressDashboard();

	} 
}

	
	


