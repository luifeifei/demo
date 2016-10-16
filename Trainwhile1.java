import java.util.Scanner;

/*
 * 输入十个正数和负数并输出正数与负数的个数
**/
public class Trainwhile1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;//记录负数的个数
		int m = 0;//记录正数的个数
		Scanner input = new Scanner(System.in);//从键盘上输入数据
		for(int i=0;i<10;i++){//控制从键盘上输入数据次数
			int j = input.nextInt();
			if(j<0){
				k++;
				
			}else{
				m++;
				
			}
		}
		System.out.println("负数的个数"+k);//输出负数的个数
		System.out.println("正数的的个数"+m);//输出正数的个数
		}
}
