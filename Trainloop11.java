/**输出九九乘法表*/
public class Trainloop1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){//控制行数
			for(int j=1;j<=i;j++){//控制列数
				System.out.print(i+"*"+j+"="+i*j+'\t');//打印
			}
			System.out.println("");//换行
		}
		

	}

}
