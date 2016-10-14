/**
 * 家长判断嫁女儿的条件
 * */
import java.util.Scanner;//导入包


public class Trainif2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("身高（cm）");//输入身高
		double heigth = input.nextDouble();
		System.out.println("财富（千万）");
		double riches = input.nextDouble();//输入财富
		System.out.println("帅（是/否）");
		Scanner input1 = new Scanner(System.in);//输入长相是帅（true/false）
		boolean handsome =input1.nextBoolean();
		
		if(heigth>180&&riches>1E8&&handsome==true)//三个条件都满足
		{
			System.out.println("我一定要嫁给他");
		}else if(heigth>180||riches>1E7||handsome==true) //满足其中一个条件
		{
			System.out.println("也可以嫁");
		}else											//一个条件也不满足										
		{
			System.out.println("不能嫁");
		}
		
		
	}

}
