package com.crm.genericUtility;

import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("database connection done");
	}

}
