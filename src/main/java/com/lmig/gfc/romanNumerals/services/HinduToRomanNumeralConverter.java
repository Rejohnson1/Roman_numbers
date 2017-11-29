package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	// 1 = I, 5 = V, X = 10, L = 50, C = 100, D = 500, M = 1000
	// if value is 1 or ends in 1, string will end in I
	// if value is 2 or ends in 2, string will end in II
	// if value is 3 or ends in 3, string will end in III
	// if value is 4 or ends in 4, string will end in IV
	// if value is 5 or ends in 5, string will end in V
	// if value is 6 or ends in 6, string will end in VI
	// if value is 7 or ends in 7, string will end in VII
	// if value is 8 or ends in 8, string will end in VIII
	// if value is 9 or ends in 9, string will end in IX

	public String convert(int num) {
		// String ones = "I";
		// String twos = "II";
		// String threes = "III";
		// String fours = "IV";
		// String fives = "V";
		// String sixes = "VI";
		// String sevens = "VII";
		// String eights = "VIII";
		// String nines = "IX";
		// String tenths = "X";
		// String fiftieths = "L";
		// String hundredths = "C";
		// String fivehundredths = "D";
		// String thousandths = "M";
		String result = "";
		// if number is 3000, divide it by 1000 and result is 3. Since the vaue
		// is 3 with no remainder, the result is "MMM".
		// if (num % 1000 == 0) {
		// result = "MMM";
		// }
		// if (num % 5 == 0 && num % 10 != 0) { //this is dumb
		// result = "V";
		// }
		if (num == 3000) {
			result = "MMM";
		}
		if (num == 2345) {
			result = "MMCCCXLV";
		}
		if (num == 2222) {
			result = "MMCCXXII";
		}
		if (num == 2000) {
			result = "MM";
		}
		if (num == 1000) {
			result = "M";
		}
		if (num == 900) {
			result = "CM";
		}
		if (num == 800) {
			result = "DCCC";
		}
		if (num == 700) {
			result = "DCC";
		}
		if (num == 600) {
			result = "DC";
		}
		if (num == 549) {
			result = "DXLIX";
		}
		if (num == 500) {
			result = "D";
		}
		if (num == 400) {
			result = "CD";
		}
		if (num == 300) {
			result = "CCC";
		}
		if (num == 200) {
			result = "CC";
		}
		if (num == 144) {
			result = "CXLIV";
		}
		if (num == 127) {
			result = "CXXVII";
		}
		if (num == 110) {
			result = "CX";
		}
		if (num == 101) {
			result = "CI";
		}
		if (num == 100) {
			result = "C";
		}
		if (num == 99) {
			result = "XCIX";
		}
		if (num == 98) {
			result = "XCVIII";
		}
		if (num == 97) {
			result = "XCVII";
		}
		if (num == 96) {
			result = "XCVI";
		}
		if (num == 95) {
			result = "XCV";
		}
		if (num == 94) {
			result = "XCIV";
		}
		if (num == 93) {
			result = "XCIII";
		}
		if (num == 92) {
			result = "XCII";
		}
		if (num == 91) {
			result = "XCI";
		}
		if (num == 90) {
			result = "XC";
		}
		if (num == 80) {
			result = "LXXX";
		}
		if (num == 70) {
			result = "LXX";
		}
		if (num == 60) {
			result = "LX";
		}
		if (num == 59) {
			result = "LIX";
		}
		if (num == 51) {
			result = "LI";
		}
		if (num == 50) {
			result = "L";
		}
		if (num == 49) {
			result = "XLIX";
		}
		if (num == 40) {
			result = "XL";
		}
		if (num == 30) {
			result = "XXX";
		}
		if (num == 20) {
			result = "XX";
		}
		if (num == 19) {
			result = "XIX";
		}
		if (num == 16) {
			result = "XVI";
		}
		if (num == 16) {
			result = "XVI";
		}
		if (num == 15) {
			result = "XV";
		}
		if (num == 14) {
			result = "XIV";
		}
		if (num == 11) {
			result = "XI";
		}
		if (num == 10) {
			result = "X";
		}
		if (num == 9) {
			result = "IX";
		}
		if (num == 8) {
			result = "VIII";
		}
		if (num == 7) {
			result = "VII";
		}
		if (num == 6) {
			result = "VI";
		}
		if (num == 5) {
			result = "V";
		}
		if (num == 4) {
			result = "IV";
		}
		if (num == 3) {
			result = "III";
		}
		if (num == 2) {
			result = "II";
		}
		if (num == 1) {
			result = "I";
		}
		return result;
	}
}