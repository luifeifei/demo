/*
 * 打印                         i   k  j  k =4-i j =i+1
 *     *     0   4  1
 *    * *    1   3  2
 *   * * *   2   2  3
 *  * * * *  3   2  4  
 * * * * * * 4   0  5 //先分析再编程
 * 
 *  * * * *  0   1  4 k =i+1 j =4-i
 *   * * *   1   2  3
 *    * *    2   3  2
 *     *     3   4  0
 * 
 *     
 * 
 * 
 */
public class Trainloop6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*上半部分*/
		for(int i=0;i<5;i++){//控制行数
			for(int k=0;k<4-i;k++){//控制每行输出空格数
				System.out.print(" ");//输出空格
			}
			for(int j=0;j<i+1;j++){//控制总的列数
				System.out.print("* ");//输出*
				
			}
			System.out.println();//每一行执行额按后换行
			
		}
		/*下半部分*/
		for(int i=0;i<4;i++){
			for(int k=0;k<i+1;k++){
				System.out.print(" ");
			}
			for(int j=0;j<4-i;j++){
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		

	}

}
