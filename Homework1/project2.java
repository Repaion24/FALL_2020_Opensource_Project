import java.util.Scanner;

public class project2 {
	
	
	

	public static void main(String[] args) {
		System.out.println("����");
		Scanner scanner = new Scanner(System.in);
		
		int fir = scanner.nextInt();
		String what = scanner.next();
		int sec = scanner.nextInt();
		float result = 0;
		
		switch(what) {
			case "+":
				result = fir + sec;
				break;
			case "-":
				result = fir - sec;
				break;
			case "*":
				result = fir * sec;
				break;
			case "/":
				if(sec == 0) {
					break;
				}
				result = (float)fir/(float)sec;
				break;
		
		}
		if(sec == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		else {
			System.out.print(fir + what + sec +"�� ��� ����� " + result);
		}
		scanner.close();
	}

}
