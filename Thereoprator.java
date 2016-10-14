/**
 * 三目运算符
 * */
import java.util.Scanner;//导入包


public class Thereoprator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int max =(a>b)?a:(b>c)?b:c;
		System.out.println(max);
		

	}

}
