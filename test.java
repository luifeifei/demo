/**三目运算符运用*/
public class test {//创建类

	public static void main(String[] args) {
		String score;		//声明String型变量score用于保存成绩档次
		int score2 =70;		//声明int型变量score2用于保存成绩
		score = score2>=90?"优秀":(score2>=70?"良好":(score2>60?"及格":"不及格"));
		System.out.println(score);          //输出成绩档次

	}

}
