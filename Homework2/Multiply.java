import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next();
				scanner.next();
				continue;
			}
			try {
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next();
				continue;
			}
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scanner.close();
	}
}
