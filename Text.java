/**使用转意字符*/
public class Text {//定义主类


	public static void main(String[] args) {//主方法
		
		char c1 = '\\';        //将转义字符'\\' 赋值给变量c1
		char char1 = '\u2605';  //将转义字符'\u2605'赋值给变量char1
		System.out.println(c1); //输出
		System.out.println(char1);  //输出
		System.out.println("百度\t文库"); //输出并实现空格
		System.out.println("百度\n文库"); //输出并实现换行
		System.out.println("\"百度文库\"");//输出”百度文库”
				
	}

}
