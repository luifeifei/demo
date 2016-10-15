import java.util.Scanner;


public class Trainswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word =input.next();
		char word1 = word.charAt(0);
		switch(word1){
		case 'a':
			System.out.println((char)(word1-32));break;
		case 'b':
			System.out.println((char)(word1-32));break;
		case 'c':
			System.out.println((char)(word1-32));break;
		case 'd':
			System.out.println((char)(word1-32));break;
		case 'e':
			System.out.println((char)(word1-32));break;
			default:
				System.out.println("other");break;
		}
		

	}


}
