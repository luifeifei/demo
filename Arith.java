/**算数运算符*/
public class Arith {//创建主类

	
	public static void main(String[] args) {//主方法
		
		float number1 = 45.56f;           //声明float型变量number1并赋值
		int number = 152;                 //声明ing型变量并赋值
		System.out.println("和为："+number+number1);   //计算变量的和并输出
		System.out.println("差为："+(number-number1)); //计算差并输出
		System.out.println("积为："+(number*number1)); //计算两变量的积冰输出
		System.out.println("商为："+(number/number1)); //计算两边量的商并输出
		System.out.println("余数为："+(number%(int)number1)); //number1对number取余并输出

	}

}
