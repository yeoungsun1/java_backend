package methodTest;

public class MethodTestMain {
	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		MethodTest2 mt2 = new MethodTest2();
		MethodTest3 mt3 = new MethodTest3();
		MethodTest4 mt4 = new MethodTest4();
		
		//매개변수x, 리턴값x 메소드 호출
		mt1.hello();
		
		//매개변수o, 리턴값x 메소드 호출
		mt2.printSum(10, 20);
		
		//매개변수x, 리턴값o 메소드 호출
		mt3.getNumber(); //출력되는것 없음
		System.out.println(mt3.getNumber()); //리턴값이 있기 때문에 출력메소드를 쓰거나
		int number = mt3.getNumber(); //변수에 저장 후 출력해야함
		System.out.println(number); 
		
		//매개변수o, 리턴값o 메소드 호출
		mt4.add(1, 2); //메소드 정의 부분에서 출력메소드만 쓴 부분들만 출력됨
		System.out.println(mt4.add(2, 3)); //출력메소드 안에서 메소드 호출해야 제대로 모든 값 출력됨
		int total = mt4.add(100, 200); //아니면 변수에 저장한 뒤 사용해야 함
		System.out.println("total = " + total);
		
		
	}
}
