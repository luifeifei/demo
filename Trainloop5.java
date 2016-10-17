/*
 * 打印                         i   k  j k=4-i j=i+1
 *     *     0   4  1
 *    * *    1   3  2
 *   * * *   2   2  3
 *  * * * *  3   2  4  
 * * * * * * 4   0  5 //先分析再编程
 *     
 * 
 * 
 */
public class Trainloop5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){//控制行数
			for(int k=0;k<4-i;k++){//控制每行的空格数
				System.out.print(" ");//输出空格	
			}
			for(int j=0;j<i+1;j++){
				System.out.print("* ");
			}
			System.out.println();//每执行完一行后换行
			
		}

	}

}
