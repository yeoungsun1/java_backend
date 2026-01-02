package input;

import java.util.Scanner;

//4번 : 입력메소드(next()와 nextLine()의 차이)
public class InputTest03 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
//	ctrl + shift + o
	
	sc.next();
	sc.next();
//	sc.next();

//	sc.nextLine();
//	sc.nextLine();
//	sc.nextLine();
	
	//입력받은 값을 문자열로 돌려준다
	//next()와 nextLine()의 차이는 임시저장공간(buffer)에서 엔터를 소모하냐 소모하지 않느냐에 있다
	//nextLine()만 임시 저장공간에서 엔터를 지워준다(소모한다)

	sc.close();
//	sc.next(); 
//	close 메소드 뒤에는 입력받지 못한다
	
	}
	
}
