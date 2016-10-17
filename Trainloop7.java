/*打印1-100的所有质数*/
public class Trainloop7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start =System.currentTimeMillis();//获取开始时间
		for(int i=2;i<=100;i++){//变量2-100的
			boolean a = false;//结束循环语句
			for(int j=2;j<i;j++){//遍历i的
				/*判断是否为质数*/
				if(i%j==0){
					a = true;
					break;
				}
				
			}
			if(a==false){
				System.out.println(i);
			}
		}
		
		long end =System.currentTimeMillis();//获取结束时间
		
		System.out.println("所花费的时间为："+(end-start));
	
	}
}
