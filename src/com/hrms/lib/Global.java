package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	 WebDriver driver;
     // to provide Test Data & Object of Whole Application
  //=======Test Data
	//    DT      DV     DVV
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String efn="rakesh";
	public String eln="ram";
	public String FN ="Akarsh";
	public String LN ="Avula";
	public String EmpID="9383";
	// ======Object/Elements
	//    login & logout
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login   ="Submit";
	public String link_logout ="Logout";
	
	public String fram_empinfo="rightMenu";
	public String add_btn     ="//input[@value='Add']";
	public String txt_efn     ="txtEmpFirstName";
	public String txt_eln     ="txtEmpLastName";
	public String btn_save    ="btnEdit";
	
	public String btn_Edit    ="btnEditPers";
	public String txt_FN      ="txtEmpFirstName";
	public String txt_LN      ="txtEmpLastName";
	public String Btn_save    ="btnEditPers";
	
	public String select    ="loc_code";
	public String by_value ="0";
	public String txt_search_for="loc_name";
	public String btn_search    ="//input[@value='Search']";
	public String btn_checkbox  ="chkLocID[]";
	public String btn_delete   = "//input[@value='Delete']";
}

