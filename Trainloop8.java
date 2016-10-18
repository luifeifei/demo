/*3000米长的绳子每天减一半，多少天小于5米*/
public class Trainloop8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 0;//记录天数
		for(int string = 3000;string>=5;day++){
			string/=2;
		}
        System.out.println(day);//输出天数
	}

}
