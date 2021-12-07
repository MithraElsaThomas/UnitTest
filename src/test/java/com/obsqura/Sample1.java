package com.obsqura;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		int a=2;
		int b=1;
		int expect=1;
		int actual=Add.sub(a, b);
		Assert.assertEquals(actual, expect);
		

	}
}
