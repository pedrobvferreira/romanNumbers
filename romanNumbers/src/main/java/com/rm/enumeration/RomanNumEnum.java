package com.rm.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum RomanNumEnum {
	I('I', 1),
	V('V', 5),
	X('X', 10),
	L('L', 50),
	C('C', 100),
	D('D', 500),
	M('M', 1000);
	
	Character ch = null;
	Integer val = null;
	private static Map<Character, Integer> numbersMap = new HashMap<>();

	RomanNumEnum(Character ch, Integer val) {
		this.ch = ch;
		this.val = val;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}
	
	static {
        for (RomanNumEnum pageType : RomanNumEnum.values()) {
        	numbersMap.put(pageType.ch, pageType.val);
        }
    }

    public static Integer get(Object key) {
        return numbersMap.get(key);
    }

}
