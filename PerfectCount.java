/*一个数恰好的与它因子之和称为完数例如 6=1+2+3；输出1000以内的所有完数*/
public class PerfectCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k= 0;//记录因子的和s
		for(int i=1;i<1000;i++){//遍历1000以内的数
			for(int j=1;j<i;j++){//找约数
				if(i%j==0){
				k+=j;//获取因子的和
				}
			}
				if(i==k){
					System.out.println(i);//打印
				}
			k = 0;//因子清零
		}

	}

}
