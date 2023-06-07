package com.csvdemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class StateCensusAnlyserTest {

	StateCensusAnlyser state = new StateCensusAnlyser();
	
	@Test
	public void shouldReturnTrue() {
		Assertions.assertTrue(state.countData(51));
	}
	
	@Test
	public void shouldReturnFalse() {
		Assertions.assertFalse(state.countData(30));
	}
}
