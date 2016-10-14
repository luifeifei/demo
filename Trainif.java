/**
 * if语句练习
 * 从键盘上输入三个数并按从小岛大的顺序输出
 * */
import java.util.Scanner;//导入包


public class Trainif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double max;		//声明变量max储存最大值
		Scanner input = new Scanner(System.in);//从键盘上输入数值
		 double a= input.nextDouble();		    //获取从键盘上输入的数并赋值给a
		 double b = input.nextDouble();		//获取从键盘上输入的数并赋值给b
		 double c = input.nextDouble();		//获取从键盘上输入的数并赋值给c
		 
		 
		 if(a==b&&a==c)//判断三个数是否相等
		 {
			 System.out.println("三个数想等");
		 }else{
			 if(a>b) //判断a,b间的大小
			 {
				 
				 if(a>c){
					 
					 	max = a;
					 	System.out.println(max);//输出最大值
			 	 }
				 else{
					 	max = c;
					 	System.out.println(max);
					 	
				 	  }
			 }
			 else if(b>c)//判断b，c的大小
			 {
				 max = b;
				 System.out.println(b);
				 
			 }else
			 {
				 max = c;
				 System.out.println(max);//输出最大值
			 }
		 }
		

	}
}
