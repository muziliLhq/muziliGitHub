package com.entor;

public class ConditionTest {

	public static void main(String[] args) {
		// 分数分段统计：0-59.5不及格，60-79.5及格，80-89.5良好，90-100优秀。
		// 假设当前分数是88分，请通过程序判断当前分数所处分段

		double score = 88;
		if (0 <= score && score <= 59.5) {
			System.out.println("不及格");
		} else if (score >= 60 && score <= 79.5) {
			System.out.println("及格");
		} else if (score >= 80 && score <= 89.5) {
			System.out.println("良好");
		} else if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		}

		else {
			System.out.println("不合理");
		}
	}
}
