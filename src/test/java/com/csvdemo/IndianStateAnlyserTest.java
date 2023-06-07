package com.csvdemo;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class IndianStateAnlyserTest {

	IndianStateAnlyser state1 = new  IndianStateAnlyser();
	
	@Test
	public void shouldReturnTrue() {
		Assertions.assertTrue(state1.countData1(33));
	}
	@Test
	public void shouldReturnFalse() {
		Assertions.assertFalse(state1.countData1(50));
	}
}
