package com.ras.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestFrameWork {

	@Test 
	public void tc_01()
	{
		Reporter.log("First testcase",true);
	}
	
	@Test 
	public void tc_02()
	{
		Reporter.log("second testcase",true);
	}
}
