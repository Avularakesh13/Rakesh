package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	// public static void main(String[]args) {
	@Test
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");	
			
		 General obj=new General();
		 obj.openAplications();
		 obj.Login();
		 obj.enterframe();
		 obj.add_emp();
		 obj.closefame();
		 obj.Logout();
		 obj.closeAplication();
	 }
			
}
