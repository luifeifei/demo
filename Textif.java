/**
 * if语句练习
 * 从键盘中输入小明的成绩如果为100则奖励一辆宝马，
 * 如果为（80，99）则奖励一台iphone7
 * 如果为（60，80）则奖励一本参考书
 * 如果为<60则没有奖励
 * */
import java.util.Scanner;//导入包


public class Textif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;//定义int型变量score存储成绩
		System.out.println("----请输入成绩-----");
		Scanner s = new Scanner(System.in);//键盘上输入成绩
		score= s.nextInt();//获取键盘上输入的成绩
		
		if (score>100||score<0)
		{
			System.out.println("输入有误");
		
		}else{
				if (score==100)
				{
					System.out.println("奖励一台宝马");
				}
				else if(80<=score&&score<=99)
				{
					System.out.println("奖励一台iphone7");
				}
				else if(60<=score&&score<80)
				{
					System.out.println("奖励一本参考书");
				}
				else
				{
					System.out.println("没有奖励");
				}

			}
		} 
		

}
