import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next();
				scanner.next();
				continue;
			}
			try {
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next();
				continue;
			}
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scanner.close();
	}
}
