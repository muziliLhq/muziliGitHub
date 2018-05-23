package com.entor;

public class ConditionTest2 {
	public static void main(String[] args) {
		// 3-5月是春季，6-8月是夏季，9-11月是秋季，12-2月是冬季
		// 当前是一月份，输出季节

		int month = 1 ;
		
		if (month == 3 || month == 5 || month == 4) {
			System.out.println("春季");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("夏季");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("秋季");
		} else if(month == 1 || month == 2 || month == 12) {
			System.out.println("冬季");
		}else {
			System.out.println("月季必须在1-12之间！");
		}
	}
}
