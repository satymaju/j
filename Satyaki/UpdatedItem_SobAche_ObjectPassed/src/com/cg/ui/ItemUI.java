package com.cg.ui;
import java.util.Scanner;
import com.capgemini.bin.*;

import java.util.*;

import com.capgemini.exception.*;
import com.capgemini.collection.*;
import com.capgemini.validator.*;


public class ItemUI {
	static Scanner cin=new Scanner(System.in);
	public static void main(String[] args) throws ItemException{
		// TODO Auto-generated method stub
       int choice;

       while(true)
{

	System.out.println("Enter your choice");
	System.out.println("1----Add Details");
	System.out.println("2----Count Records");
	System.out.println("3---- Display Records");
	System.out.println("4---- find duplicate");
	System.out.println("5---- remove Records");
	System.out.println("6----Exit");
	
	choice=cin.nextInt();
	switch(choice)
	{
	case 1:{
		System.out.println("Add Details");
		kk();
		System.out.println("Press 'Y' to Continue & 'N' to end:");
		String op=cin.next();
		//System.out.println(op);
		if(op.equals("y") ||op.equals("Y") )
		{
			//System.out.println("continue "+op);
			continue;
			
		}
		else
		{
			System.out.println("Thank You");
			System.exit(0);
		}
		
		break;}
	
	case 2:{System.out.println("count Records");
	Collector.count_records();
	System.out.println("Press 'Y' to Continue & 'N' to end:");
	String op=cin.next();
	//System.out.println(op);
	if(op.equals("y") ||op.equals("Y") )
	{
		//System.out.println("continue "+op);
		continue ;
		
	}
	else
	{
		System.out.println("Thank You");
		System.exit(0);
	}
	
	
	break;}
	case 3:{
		{System.out.println("Display Records");
		//display_records();
		Collector.display_rec();
		System.out.println("Press 'Y' to Continue & 'N' to end:");
		String op=cin.next();
		//System.out.println(op);
		if(op.equals("y") ||op.equals("Y") )
		{
			//System.out.println("continue "+op);
			continue ;
			
		}
		else
		{
			System.out.println("Thank You");
			System.exit(0);
		}
		
		//System.out.println("")
		
		
		
		
		break;}
		}
	case 4:{System.out.println("find duplicate");
	System.out.println("Enter id to find duplicate");
	int id=cin.nextInt();
			 Collector.duplicate(id);
	break;}
	case 5:{System.out.println("remove Records");
	System.out.println("Enter ID to Remove Specific Record by ID");
	int get_id=cin.nextInt();
	Collector.remove_by_id(get_id);
	System.out.println("Press 'Y' to Continue & 'N' to end:");
	String op=cin.next();
	//System.out.println(op);
	if(op.equals("y") ||op.equals("Y") )
	{
		//System.out.println("continue "+op);
		continue ;
		
	}
	else
	{
		System.out.println("Thank You");
		System.exit(0);
	}
	break;}
	case 6:{System.exit(0);
	break;}
	default:{System.out.println("Enter proper option");
	break;}
	}
	
}
	}
	


	public static void kk() throws ItemException{
		System.out.println("Enter Number of Items to be Added");
		//System.out.println("Add Details")
		int Num_Items;
		Num_Items=cin.nextInt();
		
		while(Num_Items!=0)
		{
			
			System.out.println("Enter Item ID");
			String item_id=cin.next();
			try {
			if(!Validator.validate_id(item_id)) 
			{
				System.exit(0);
			}
			System.out.println("Enter Item Name");
			String item_name=cin.next();
			if(!Validator.validate_name(item_name))
			{
				System.exit(0);
			}
			System.out.println("Enter Item Price");
			String item_price=cin.next();
			if(!Validator.validate_price(item_price))
			{
				System.exit(0);
			}
 			
			       
			

			Random randomGenerator = new Random();
			int txn_id = randomGenerator.nextInt(9999);
			//int id=Integer.parseInt(item_id);
			ItemSchema sch=new ItemSchema(Integer.parseInt(item_id),item_name,Double.parseDouble(item_price),txn_id);
			Collector.adddetails(sch);
			}
			catch(ItemException e)
			{
				
				
			}
			Num_Items--;
		}
		
		
	}

	

}

