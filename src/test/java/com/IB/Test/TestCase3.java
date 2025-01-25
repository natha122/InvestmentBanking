package com.IB.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test
	public void verifyTitleOfPage() {
		
		Assert.assertEquals("Google", "Google");
		
	}

}
