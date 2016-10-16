/**
 * 100以内偶数输出与和*/
public class Trainwhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1 ;//记录偶数
		int sum = 0;//记录和
	
		while(i<101){
			if(i%2==0){
				System.out.println(i);
				sum+=i;//计算和
			}
			
			i++;
		}
		System.out.println(sum);//打印和
		System.out.println(i);

	}

}
