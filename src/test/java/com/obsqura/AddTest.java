package com.obsqura;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTest {
  @Test (enabled = false)
	public void test1() {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int expect=3;
		int actual=Add.add(a, b);
		Assert.assertEquals(actual, expect);
		

	}
 
}
