package com.crm.genericUtility;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("database connection done");
	}

	@BeforeTest
	public void bt()
	{
		System.out.println("parallel connection done");
	}
}
