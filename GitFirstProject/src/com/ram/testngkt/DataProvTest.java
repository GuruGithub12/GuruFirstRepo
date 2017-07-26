package com.ram.testngkt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvTest {
	
	
	@Test(dataProvider="getData")
	public void printDataProv1(String itemName, String color){
		System.out.println(itemName +" is "+color);
		
	}
	
	@DataProvider()
	public Object[][] getData(){
		
		Object[][] data = new Object[4][2];
		
		Object[] item1 = new Object[2];
		item1[0] ="Bag";
		item1[1] = "Black";
		
		Object[] item2 = {"Window","grey"};
		Object[] item3 = {"Chair","green"};
		Object[] item4 = {"Table","brown"};
		
		data[0] = item1;
		data[1] = item2;
		data[2] = item3;
		data[3] = item4;
		
		return data;
		
		
	}
	
	
}
