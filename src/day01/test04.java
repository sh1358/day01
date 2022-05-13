package day01;

public class test04 {
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println("변경 전 : "+ch);
		ch = 'B';
		System.out.println("변경 후 : "+ch);
		System.out.println();
		System.out.println("연산 : "+ (ch+32));
		System.out.println("연산 : "+ (char)(ch+32));
		System.out.println("연산 : "+ (double)(ch+32));
		
		System.out.println(1.111);
		System.out.println((int)1.111);
	}
}
