package com.capgemini.junit;

import static org.junit.Assert.*;

//import org.junit.Test;
import org.junit.*;

import com.capgemini.bin.*;
import com.capgemini.collection.*;
import com.capgemini.exception.*;
import com.capgemini.validator.*;

public class ItemSchemaTest {
	static ItemSchema item=null;
	static Collector collection_helper;
	

	@Test
	public void test() {	
	//collection_helper.adddetails(item);
	Assert.assertNotNull(collection_helper);
	System.out.print(collection_helper);
	}
	@Before 
	public void beforeclass()
	{
		collection_helper= new Collector();
		item = new ItemSchema(123,"aaa",123.56,1234);
		//item = null;
	}
	
	
	@After
	public void afterclass()
	{
		item=null;
		collection_helper=null;
	}
	
	
}
