/*
 *  打印：
 *  
 *   *****
 *   ****
 *   ***
 *   **
 *   * 
 *        */
public class Trainloop4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++){//控制行数
			for(int j=0;j<5-i;j++){//控制列数
				System.out.print("*");//打印
			}
			System.out.println();//换行
		}

	}

}
