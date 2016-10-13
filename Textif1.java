import java.util.Scanner;


public class Textif1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//键盘上输入成绩
		int a= s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a==b&&b==c){
			System.out.print("这三个数相等。");

			}else{
					System.out.println(a);
		
			   	 }

			}

}
