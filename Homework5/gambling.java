import java.util.Scanner;
import java.lang.Math;


class Person{
	protected String Name;
	
	Person(){
		this.Name = "홍길동";
	}
	
	public void giveName() {
		Scanner scanner = new Scanner(System.in);
		this.Name = scanner.next();
	}
	
	public String returnname() {
		return this.Name;
	}
}

public class gambling {
	
	public static int iswin(int a, int b, int c) {
		int X = 0;
		if(a==b && b==c)
			X = 1;
		return X;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int one, two, three;
		int play = 0;
		int res = 0;
		Person player1 = new Person();
		Person player2 = new Person();
		
		System.out.print("1번째 선수 이름>>");
		player1.giveName();
		System.out.print("2번째 선수 이름>>");
		player2.giveName();
		
		while(true) {
			one = (int)(Math.random()*3+1);
			two = (int)(Math.random()*3+1);
			three = (int)(Math.random()*3+1);
			res = iswin(one,two,three);
			if(play % 2 == 0) {
				System.out.print("[" + player1.returnname() + "]:");
				scanner.nextLine();
				System.out.print("    " + one + " " + two + " " + three + " ");
				if(res == 1) {
					System.out.print(player1.returnname() + "님이 이겼습니다!");
					break;
				}
				else
					System.out.print("아쉽군요!\n");
			}
			else {
				System.out.print("[" + player2.returnname() + "]:");
				scanner.nextLine();
				System.out.print("    " + one + " " + two + " " + three + " ");
				if(res == 1) {
					System.out.print(player2.returnname() + "님이 이겼습니다!");
					break;
				}
				else
					System.out.print("아쉽군요!\n");
			}
			play += 1;
		}
		scanner.close();
	}

}
