package com.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import com.rm.helper.InputUtils;

public class InputUtilsTest {
	
	@Test
	public void inputIsEmpty() {
		assertThat(InputUtils.isEmpty(""), is(true));
	}
	
	@Test
	public void inputIsNumeric() {
		assertThat(InputUtils.isNotNumeric("1"), is(false));
	}
	
	@Test
	public void inputIsDouble() {
		assertThat(InputUtils.isNotDouble("2.0"), is(false));
	}
	
	@Test
	public void inputIsFloat() {
		assertThat(InputUtils.isNotFloat("5f"), is(false));
	}
}
