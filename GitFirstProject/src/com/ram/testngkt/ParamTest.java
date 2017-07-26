package com.ram.testngkt;

import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	@Parameters({"laptop", "car"})
	@Test
	public void printParameter(@Optional("Dell")String laptopName, @Optional("Mercedes")String car){
		System.out.println(laptopName);
		System.out.println("Car name is "+car);
	}
	
	@Test
	public void printParameter2(ITestContext myContext){
		
		String carName = myContext.getCurrentXmlTest().getParameter("car");
		System.out.println(carName);
		
	}
	
}
