package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;
public class General extends Global{
	 
	// to proved all re-usable fun:/method of whole aplication
		//test steps
	 public void openAplications() {
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("aplication open");//consol
		Reporter.log("Application opened"); // html report
		Log.info(" Application Opened"); //logfile
	 }
	 public void closeAplication() {
		 driver.close();
		 System.out.println("aplications close");
		 Reporter.log("Application close"); // html report
			Log.info(" Application close"); //logfile
	 }
	    //login logout
	 public void Login() {
		 driver.findElement(By.name(txt_loginname)).sendKeys(un);
		 driver.findElement(By.name(txt_password)).sendKeys(pw);
		 driver.findElement(By.name(btn_login)).click();
		 System.out.println("login complited");//consol
		 Reporter.log("login complited"); // html report
		 Log.info("login complited"); //logfile
	 }
	 public void Logout() {
		 driver.findElement(By.linkText(link_logout)).click();
		 System.out.println("logout complited");//consol
		 Reporter.log("logout complited"); // html report
		 Log.info("logout complited"); //logfile
	 }	
	   // add new employee
	 public void enterframe() {
		 driver.switchTo().frame(fram_empinfo);
		 System.out.println("fremopen");
		 Reporter.log("fremopen"); // html report
		 Log.info("fremopen"); //logfile
	 }
	 public void closefame() {
		 driver.switchTo().defaultContent();
		 System.out.println("frame close");//consol
		 Reporter.log("frame close"); // html report
		 Log.info("frame close"); //logfile
	 }
	 public void add_emp() {
		 driver.findElement(By.xpath(add_btn)).click();
		 driver.findElement(By.name(txt_efn)).sendKeys(efn);
		 driver.findElement(By.name(txt_eln)).sendKeys(eln);
		 driver.findElement(By.id(btn_save)).click();
		 System.out.println("new  emp added");//consol
		 Reporter.log("new  emp added"); // html report
		 Log.info("new  emp added"); //logfile
		  }
	     //Edit employee Deta
	 public void edit_employee() {
		 driver.findElement(By.id(btn_Edit)).click();
	     driver.findElement(By.name(txt_FN)).clear();
		 driver.findElement(By.name(txt_LN)).clear();
		 driver.findElement(By.name(txt_FN)).sendKeys(FN);
		 driver.findElement(By.name(txt_LN)).sendKeys(LN);
		 driver.findElement(By.id(Btn_save)).click();
		 System.out.println("employee details edid");//consol
		 Reporter.log("employee details edid"); // html report
		 Log.info(" employee details edid"); //logfile
	 }
	 //Deleted employee
	 public void deleted_employee(){
		 Select st=new Select(driver.findElement(By.name(select)));
		 st.selectByValue(by_value);
		 driver.findElement(By.name(txt_search_for)).sendKeys(EmpID);
		 driver.findElement(By.xpath(btn_search)).click();
		 driver.findElement(By.name(btn_checkbox)).click();
		 driver.findElement(By.xpath(btn_delete)).click();
		 System.out.println("employee deleted");//consol
		 Reporter.log("employee deleted"); // html report
		 Log.info(" employee deleted"); //logfile
		 
	 }
	}
