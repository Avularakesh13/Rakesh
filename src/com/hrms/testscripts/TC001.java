package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {
	//public static void main(String[] args) {
		//Test steps
	@Test
public void tc001() {	
	DOMConfigurator.configure("log4j.xml");	
	General obj=new General();
	obj.openAplications();
	obj.Login();
	obj.Logout();
	obj.closeAplication();
}
}

