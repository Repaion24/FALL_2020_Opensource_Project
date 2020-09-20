import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissors {
	
	public static int winner(String X, String Y) {
		switch(X) {
		case "가위" :
			if(Y == "가위")
				return 0;
			else if(Y == "바위") 
				return -1;
			else
				return 1;
		case "바위" :
			if(Y == "바위")
				return 0;
			else if(Y == "보") 
				return -1;
			else
				return 1;
		case "보":
			if(Y == "보")
				return 0;
			else if(Y == "가위") 
				return -1;
			else
				return 1;
		case"그만":
			return -5;
		}
		return -5;
	}

	public static void main(String[] args) {
		String what[] = {"가위","바위","보"};
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.\n");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String player = scanner.next();
			
			int computer = random.nextInt(2);
		
			int win = winner(player, what[computer]);
			if(win==1)
				System.out.print("사용자 = " + player + " , 컴퓨터 = " + what[computer] + ", 사용자가 이겼습니다.\n");
			else if (win == -1)
				System.out.print("사용자 = " + player + " , 컴퓨터 = " + what[computer] + ", 컴퓨터가 이겼습니다.\n");
			else if (win == 0)
				System.out.print("사용자 = " + player + " , 컴퓨터 = " + what[computer] + ", 비겼습니다.\n");
			else if (win == -5)
				break;
		}
		System.out.print("게임을 종료합니다...");
		scanner.close();
	}
}
