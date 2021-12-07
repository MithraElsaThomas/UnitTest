package com.obsqura;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int expect=2;
		int actual=Add.mul(a, b);
		Assert.assertEquals(actual, expect);
		

	}

}
