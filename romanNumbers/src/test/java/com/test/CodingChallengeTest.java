package com.test;

import org.junit.jupiter.api.Test;

import com.rm.helper.RomanConverter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CodingChallengeTest {
	
    @Test
    public void convertRomanI() {
    	int result = RomanConverter.romanToInteger("I");
    	assertThat(result, is(1));
    }
    
    @Test
    public void convertRomanVII() {
    	int result = RomanConverter.romanToInteger("VII");
    	assertThat(result, is(7));
    }
    
    @Test
    public void convertRomanXXI() {
    	int result = RomanConverter.romanToInteger("XXI");
    	assertThat(result, is(21));
    }
    
    @Test
    public void convertRomanDCCXCIX() {
    	int result = RomanConverter.romanToInteger("DCCXCIX");
    	assertThat(result, is(799));
    }
}
