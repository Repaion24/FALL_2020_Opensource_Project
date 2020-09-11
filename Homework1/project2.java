import java.util.Scanner;

public class project2 {
	
	
	

	public static void main(String[] args) {
		System.out.println("연산");
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
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
			System.out.print(fir + what + sec +"의 계산 결과는 " + result);
		}
		scanner.close();
	}

}
