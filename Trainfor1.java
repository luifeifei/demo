/**遍历1-150
 * 并在3的整数后输出foo
 * 在5的整数倍后输出biz
 * 在7的整数倍的数后输出baz
 */
public class Trainfor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=150;i++) {
		
			System.out.print(i);
		
			if(i%3==0){
				System.out.print("foo");
			}
			if(i%5==0){
				System.out.print("biz");
			}
			if(i%7==0){
				System.out.print("baz");
			}
			System.out.println();//换行
		}
		
	}

}
