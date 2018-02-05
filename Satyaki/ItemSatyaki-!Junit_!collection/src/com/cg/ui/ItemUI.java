package com.cg.ui;
import java.util.Scanner;

import com.cg.helper.*;
import java.math.*;
import com.cg.bin.*;
import com.cg.exception.*;

public class ItemUI {
	 Scanner sc=new Scanner(System.in); int a;
	public static void main(String args[]) {ItemUI i=new ItemUI();
		// TODO Auto-generated method stub
		int ch=0;i.a=5;
		
		ItemUI ui=new ItemUI();
		try{
			
		while(true){
			System.out.println("Enter \n 1-add \n 2-total count \n3-display record\n4-find dup record\n5-remove record \n 6-exit");
			//System.out.println("Please enter your choice");
			ch=i.sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("add");
					ui.addDetails();
					
					break;
				case 2:
					System.out.println("count");
					break;
				case 3:
					System.out.println("display");
					break;
				case 4:
					System.out.println("find duplicate");
					break;	
				case 5:
					System.out.println("remove record");
					break;	
				default:
					System.exit(0);
				}
			}
		}
		catch(Exception e){System.out.println("Enter correct choice format");}
}
	
	public void addDetails()throws Exception{
		Scanner sc=new Scanner(System.in);
		Validator v=new Validator();
		CollectionHelper CollectionHelper=new CollectionHelper();
		String id,name,price;
		double txnID;
		System.out.println("enter item ID:");
		id=sc.next();
		if(v.validateID(id)){
			
			CollectionHelper.addID(Integer.parseInt(id));
			System.out.println("Enter Item name:");
			name=sc.next();
			if(Validator.validateName(name)){
				CollectionHelper.addName(name);
				System.out.println("Enter Item price:");
				price=sc.next();
				if(Validator.validatePrice(price)){
					CollectionHelper.addPrice(Double.parseDouble(price));
					txnID=Math.random();
					CollectionHelper.addTxnID(txnID);
				}
			}
		}
	}

}
