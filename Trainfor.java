/**for循环输出100内的偶数*/
public class Trainfor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;//用来记录所有偶数的和
		int count = 0;//保存偶数的个数
		for(int i=1;i<101;i++){//遍历100以内的所有偶数
			if(i%2==0){
				count+=1;
				sum+=i;//计算100内偶数的和
				System.out.println(i);//输出100以内的偶数
			}
		}
		System.out.println("100内偶数的和为"+sum);//输出100以内的偶数的和
		System.out.println("100内偶数个数有"+count+"个");//输出100以内的偶数个数

	}

}
