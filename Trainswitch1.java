/**
 * 输入月份并判断其季节
 * */
import java.util.Scanner;//导入包


public class Trainswitch1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int moth = input.nextInt();//从键盘上输入月份
		/*判断*/
		switch(moth){
		case 3:case 4:case 5:
			System.out.println("春季");break;//打印春季
		case 6:case 7: case 8:
			System.out.println("夏季");break;//打印夏季
		case 9:case 10:case 11:
			System.out.println("秋天");break;//打印秋天
		case 12:case 1:case 2:
			System.out.println("冬天");break;
		default :
			System.out.println("输入错误");
		}
		

	}

}
