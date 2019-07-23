package com.stringprogram;

import org.apache.commons.lang3.StringUtils;

public class LeftandRightpadding {

	public static void main(String[] args) {
		String s="gayatri";
		//left paddng
		System.out.println(StringUtils.leftPad(s, 10, "a"));
		//right padding
		System.out.println(StringUtils.rightPad(s, 10, "0"));
	}

}
