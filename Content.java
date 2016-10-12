/**测试常量与变量的作用范围*/
public class Content {//创建类
	
	static int age = 13; 				//声明int变量age并赋值
	static final double p = 3.14;   	//声明double静态敞亮p并赋值
	

	public static void main(String[] args) {//主方法
		final int number;               //声明int常量number
		number = 1235;                  //赋值给常量number
		age = 22;                       //再次赋值给变量age
		//number = 1244;
		/*输出*/
		System.out.println("常量P的值为"+p);
		System.out.println("变量age的值为"+age);
		System.out.println("常量number的值为"+number);
		
		

	}

}
