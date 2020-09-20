import java.util.Scanner;
import java.util.Random;

public class Rock_paper_scissors {
	
	public static int winner(String X, String Y) {
		switch(X) {
		case "����" :
			if(Y == "����")
				return 0;
			else if(Y == "����") 
				return -1;
			else
				return 1;
		case "����" :
			if(Y == "����")
				return 0;
			else if(Y == "��") 
				return -1;
			else
				return 1;
		case "��":
			if(Y == "��")
				return 0;
			else if(Y == "����") 
				return -1;
			else
				return 1;
		case"�׸�":
			return -5;
		}
		return -5;
	}

	public static void main(String[] args) {
		String what[] = {"����","����","��"};
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		System.out.print("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.\n");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String player = scanner.next();
			
			int computer = random.nextInt(2);
		
			int win = winner(player, what[computer]);
			if(win==1)
				System.out.print("����� = " + player + " , ��ǻ�� = " + what[computer] + ", ����ڰ� �̰���ϴ�.\n");
			else if (win == -1)
				System.out.print("����� = " + player + " , ��ǻ�� = " + what[computer] + ", ��ǻ�Ͱ� �̰���ϴ�.\n");
			else if (win == 0)
				System.out.print("����� = " + player + " , ��ǻ�� = " + what[computer] + ", �����ϴ�.\n");
			else if (win == -5)
				break;
		}
		System.out.print("������ �����մϴ�...");
		scanner.close();
	}
}
