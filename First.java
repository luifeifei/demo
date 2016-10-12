/**自加自减*/
public class First {


	public static void main(String[] args) {

		int x = 10;              //声明变量int型变量x并赋值
		int a = x+x++; 			//计算x+x++并赋值给a
		System.out.println ("a="+a); //输出计算结果
		System.out.println("x="+x);  //输出自加后x的值的值
		int b = x+ ++x;              //计算x+ ++x并赋值给b
		System.out.println("b="+b);  //输出计算结果
		System.out.println("x="+x);  // 输出自加后x的值的值
		int c = x+ --x;              //计算x+--x并赋值给c
		System.out.println("c="+c);  //输出计算结果
		System.out.println("x="+x);  //输出自减后x的值
		int d = x+--x;				//计算x+--x的值并赋值给b
		System.out.println("d="+d);	//输出技术按结果
		System.out.println("x="+x); //将自减后x输出

	}
}