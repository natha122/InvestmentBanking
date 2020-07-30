package com.IB.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTC1 {

	@Test(priority = 1)
	public void Additoin() {
		int a = 10, b = 20;
		System.out.println("Test case Addition");
		Assert.assertEquals(30, a + b);

	}

	@Test(priority = 2)
	public void Subtraction() {
		int a = 10, b = 20;
		System.out.println("Test case Subtraction");
		Assert.assertEquals(10, b - a);

	}

	@Test(priority = 3)
	public void Multiplication() {
		int a = 10, b = 20;
		System.out.println("Test case Multiplication");
		Assert.assertEquals(200, a * b);

	}

	@Test(priority = 4)
	public void Dividation() {
		int a = 10, b = 20;
		System.out.println("Test case Dividation");
		Assert.assertEquals(2, b / a);

	}

}
