/**100以内偶数输出与和*/
public class Traindowhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;//记录偶数
		int sum = 0;//记录和
		do{
			
			
			i++;
			if(i%2==0){
				System.out.println(i);//输出偶数
				sum+=i;
			}
		}
		while(i<=100);
		System.out.println(sum);//输出和

	}

}
