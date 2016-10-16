
/**输入个数不确定的正数和负数
 * 输入0时终止
 * 并输出正数和负数的个数*/
import java.util.Scanner;

public class Trainloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;//记录正数个数
		int number1 = 0;//记录负数个数
		Scanner input = new Scanner(System.in);
		for(;;){
			int s =input.nextInt();
			if(s>0){
				number++;//负数的个数
			}else if(s<0){
				number1++;//正数的个数
			}else{
				break;
			}
			
		}
		System.out.println("正数的个数："+number);//输出正数的个数
		System.out.println("负数的个数："+number1);//输出负数的个数
	}

}
