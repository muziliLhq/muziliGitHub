package com.entor;

/**
 * 赋值运算
 * 
 * @author Administrator
 *
 */
public class OperatorTest3 {
	public static void main(String[] args) {
		// 定义两个变量
		int a = 1, b = 2;

		// a+=b => a = a + b
		System.out.println("a+=b=>" + (a += b));// a=3
		System.out.println("b+=a=>" + (b += a));// b=5
		System.out.println("a=" + a);// a=3
		System.out.println("b=" + b);// b=5

		// a-=b
		System.out.println("a-=b=>" + (a -= b));// a=-2
		System.out.println("b-=a=>" + (b -= a));// b=7
		System.out.println("a=" + a);// a=-2
		System.out.println("b=" + b);// b=7

		// a*=b
		System.out.println("a*=b=>" + (a *= b));// a=-14
		System.out.println("b*=a=>" + (b *= a));// b=-98
		System.out.println("a=" + a);// a=-14
		System.out.println("b=" + b);// b=-98

		// a/=b
		System.out.println("a/=b=>" + (a /= b));// a=0
		System.out.println("b/=a=>" + (b /= a));// 异常
		System.out.println("a=" + a);// a=-14
		System.out.println("b=" + b);// b=7

		// a%=b
		System.out.println("a%=b=>" + (a %= b));// 0
		System.out.println("b%=a=>" + (b %= a));// 0
		System.out.println("a=" + a);// a=0
		System.out.println("b=" + b);// b=7
	}
}
