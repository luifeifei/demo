/**输出水仙花数
 * 即一个三位数的个位数的立方和等于其本身*/
public class Trainfor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=999;i++){//数显100-999的遍历
			int a = i/100;//百位
			int b =(i%100)/10;//十位
			int c = i%10;//个位
			if((a*a*a+b*b*b+c*c*c)==i){
				System.out.println(i+"是水仙花数");//打印i
			}
		}

	}

}
