package com.capgemini.exception;

public class ItemException1 extends Exception {
	
	public ItemException1(String name)
	{
		System.out.println("Item id entered is Invalid");
		return;
	}

}
