/**double，float变量声明及使用，以及强制类型转换，和自动类型转换*/
package com.nanchanggongxueyuan;

public class Complierfloat {//创建类


	public static void main(String[] args) {//主方法
		
		float f1 = 13.23f;         //声明float型变量f1并赋值
		double d1 = 4562.12;       //声明double型变量d1并赋值
		double d2 = 45678.1564;    //声明double型变量d2并赋值
		float f2 = (float)d1 +f1;  //获得f1与d1的和
		double d3= f1 + d2;        //获得f1与d2的和
		float f3 = (float)d1 + (float)d2 + f1;//获得d1与d2，f1的和
		System.out.println(f2);    //将f1与d1的和f2输出
		System.out.println(d3);    //将f1与d2的和d3输出
		System.out.println(f3);    //将d1，d2，f1的和f3输出
		
		

	}

}
