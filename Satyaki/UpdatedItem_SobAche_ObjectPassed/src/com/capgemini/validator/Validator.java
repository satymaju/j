package com.capgemini.validator;

import java.util.regex.*;

import com.capgemini.exception.*;

public class Validator {

	
	public static boolean validate_id(String id) throws ItemException
	{
		String pattern = "(\\d+)";
		try{
			
		
		if(Pattern.matches(pattern,id))
			//Pattern.matches(patternString, content);
		{
			return true;
		}
		else
		
			throw new ItemException();
			
			
		}
		catch(ItemException e){
			System.out.println("Wrong ID entered");
			return false;
			
		}
	}
	
	public static boolean validate_name(String name)  throws ItemException
	{
		String pattern = "[A-Za-z]{3,10}";
		try{
			
		if(Pattern.matches(pattern,name))
		{
			return true;
		}
		else
		{
			throw new ItemException();
			
		}
		}
		catch(ItemException e){
			System.out.println("Wrong Item name entered");
			return false;
			}
		}
	
	public static boolean validate_price(String price) throws ItemException
	{
		String pattern = "[0-9]{1,6}.[0-9]{1,2}";
		try{
			
		if(Pattern.matches(pattern,price))

		{
			return true;
		}
		else
		{
			throw new ItemException();
			//return false;
		}
		}
		catch(ItemException e){
			System.out.println("Wrong Item Price Entered");
			return false;
		}
	}
	
	
	
}
