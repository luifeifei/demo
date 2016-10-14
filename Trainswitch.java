/**
 * 判断学生成绩
 * (90~100)优秀
 *(80~90)良好
 *（60~70）及格
 *<60不及格
 * */
import java.util.Scanner;


public class Trainswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//输入成绩
		int grade = input.nextInt();//获得键盘上输入的成绩
		/*判断*/
		if(grade>=0) {
			switch(grade/10){
			case 10:case 9:
				System.out.println("优秀");break;//输出优秀
			case 8:
				System.out.println("良好");//输出良好
			case 6: case 7:
				System.out.println("及格");break;//输出及格
			default:
				System.out.println("不及格");break;//输出不及格
			}
			
		}else{
			System.out.println("输入错误");
		}
		

	}

}
