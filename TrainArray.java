/*输出2016年每个月的天数*/
public class TrainArray {


	public static void main(String[] args) {
		int day[] =new int[]{31,29,31,30,31,30,31,30,31,30,31,30};//创建并初始化一维数组
		for(int i=0;i<day.length;i++){//遍历一维数组
			System.out.println((i+1)+"月"+"有"+day[i]+"天  ");//输出每个月的天数
			
		}

	}

}
