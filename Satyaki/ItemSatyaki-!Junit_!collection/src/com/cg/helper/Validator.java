package com.cg.helper;
import com.cg.exception.*;
import java.util.regex.Pattern;
import java.lang.Exception;

public class Validator {
	public static boolean validateID(String id) throws MyException {
		String pat="(\\d){5}";
		try {if(Pattern.matches(pat,id)){
			return true;
		}
		else
	throw new MyException();}
		catch (MyException e)
		{
			System.out.println("enter in correct format");
			return false;
		}
		
		
	}
	
	public static boolean validateName(String name) throws MyException{
		String pattern="[a-z]{3,10}";
		try
		{
			if(Pattern.matches(pattern,name)){
		
			return true;
		}
		else throw new MyException();
		}
		catch (MyException e){
			System.out.println("enter in correct format");
			return false;
		}
			
	}
	public static boolean validatePrice(String price) throws MyException{
		String pattern="[0-9]{1,10}";
		try{
			if(Pattern.matches(pattern,price)){
		
			return true;
		}
		else throw new MyException();
		}
		catch (MyException e){
			System.out.println("enter in correct format");
			return false;}
	}

}
