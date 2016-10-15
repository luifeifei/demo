/**输入年月日，输出n年的第多少天*/
import java.util.Scanner;


public class Trainswitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("输入年");
		int year = input.nextInt();
		System.out.println("请输入月");//输入月
		int moth = input.nextInt();
		System.out.println("请输入日");//输入日
		int day = input.nextInt();
		
		int day1 = 0;//存储天数
		
		if(moth>12){
			System.out.println("月份输入错误");
		}else{
			switch(moth){
			case 12:
				if (day>31){//判断输入日期是否正确
					System.out.println("日期输入错误");break;
				}else{
					
					day1 = day1+30;//30:十一份的30天
				}
				

			case 11:
				if(day>30){
					System.out.println("日期输入错误");break;
				}else{
					day1 = day1+31;
				}
				
				
			case 10:
				if(day>31){
					System.out.println("日期输入错误");break;
				}else{
					day1 = day1+30;
				}
				
				
			case 9:
				if(day>30){
					System.out.println("输入错误");break;
				}else{
					day1 = day1+31;
				}
				
			
			case 8:
				if(day>31){
					System.out.println("输入错误");break;
				}else{
					day1 = day1+31;
				}
				
				
			case 7:
				if(day>31){
					System.out.println("输入错误");break;
				}else{
					day1 = day1+30;
				}
				
			
			case 6:
				if(day>30){
					System.out.println("日期输入错误");break;
				}else{
					day1 = day1+31;
				}
				
			
			case 5:
				if(day>31){
					System.out.println("日期输入错误");break;
				}else{
					day1 = day1+30;
				}
				
			
			case 4:
				if(day>30){
					System.out.println("输入错误");break;
				}else{
					day1 = day1+31;
				}
				
				
			case 3:
				if(day>31){
					System.out.println("输入错误");break;
				}else{
					if (year%4==0&&year%100!=0||year%400==0){
						day1 = day1+28;
					}else{
						day1 = day1+28;
					}
				}
				
			case 2:
				if(day>29){
					System.out.println("日期输入错误");break;
				}else if (year%4==0&&year%100!=0||year%400==0){
						day1 = day1+31;
					 }else if(day>28){
						 System.out.println("日期输入错误");break;
				}else{
					day1 = day1+31;//31：一月份天数
				}
				
			case 1:
				if(day>31){
					System.out.println("日期输入错误");break;
				}else{
				day1 = day1 + day;
				}
			}
			
			System.out.println("是"+year+"第"+day1+"天");//输入日
		}
		
	
	}
}
