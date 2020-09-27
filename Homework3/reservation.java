import java.util.Scanner;
import java.util.InputMismatchException;

class sit{
	public String human[] = {"---","---","---","---","---","---","---","---","---","---"};
	
	public void print_human() {
		for(int i=0;i<10;i++) {
			System.out.print(human[i] + " ");
		}
		System.out.print("\n");
	}
	
	public void reserv() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�>>");
		String name = scanner.next();
		try {
			System.out.print("��ȣ>>");
			int where = scanner.nextInt();
			chg_name(name, where-1);
		}
		catch(InputMismatchException e) {
			System.out.print("�߸��� �Է��Դϴ�.\n");
		}
	}
	
	public void reserv_del() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�>>");
		String name = scanner.next();
		del_name(name);
	}
	
	public void del_name(String someone) {
		int i=0;
		for(i=0;i<10;i++) {
			if(someone.equals(human[i])) {
				chg_name("---",i);
				break;
			}
		}
		if(i == 10) {
			System.out.print("�������� �ʴ� �̸��Դϴ�.\n");
		}	
	}
	
	public void chg_name(String A, int B) {
		try {
			this.human[B] = A;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("1~10 ������ ���� �Է��Ͻÿ�.\n");
		}
	}
}


public class reservation {
	static sit SitS = new sit();
	static sit SitA = new sit();
	static sit SitB = new sit();
	
	public static void opt1() {
		Scanner scanner = new Scanner(System.in);
		int whatsit = 0;
		try {
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			whatsit= scanner.nextInt();
		
			switch(whatsit) {
			case 1 :
				System.out.print("S>> ");
				SitS.print_human();
				SitS.reserv();
				break;
			case 2:
				System.out.print("A>> ");
				SitA.print_human();
				SitA.reserv();
				break;
			case 3: 
				System.out.print("B>> ");
				SitB.print_human();
				SitB.reserv();
				break;
			default:
				System.out.print("�߸��� �Է��Դϴ�.\n");
				break;
			}
		}
		catch(InputMismatchException e){
			System.out.print("���ڸ� �Է��Ͻÿ�.\n");
		}
	}
	
	public static void opt2() {
		System.out.print("S>> ");
		SitS.print_human();
		System.out.print("A>> ");
		SitA.print_human();
		System.out.print("B>> ");
		SitB.print_human();
		System.out.print("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>\n");
	}

	public static void opt3() {
		Scanner scanner = new Scanner(System.in);
		int whatsit = 0;
		try {
			System.out.print("�¼� S(1), A(2), B(3)>>");
			whatsit= scanner.nextInt();
			switch(whatsit) {
			case 1 :
				System.out.print("S>> ");
				SitS.print_human();
				SitS.reserv_del();
				break;
			case 2:
				System.out.print("A>> ");
				SitA.print_human();
				SitA.reserv_del();
				break;
			case 3: 
				System.out.print("B>> ");
				SitB.print_human();
				SitB.reserv_del();
				break;
			default:
				System.out.print("�߸��� �Է��Դϴ�.\n");
				break;
			}
		}
		catch(InputMismatchException e) {
			System.out.print("���ڸ� �Է��Ͻÿ�.\n");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.\n");
		int opt=0;
		
		while(true) {
			try {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
				opt = scanner.nextInt();
				
			if(opt == 4)
				break;
			
			switch(opt) {
			case 1:
				opt1();
				continue;
			case 2:
				opt2();
				continue;
			case 3:
				opt3();
				continue;
			case 4:
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			break;
			}
			catch(InputMismatchException e) {
				System.out.print("���ڸ� �Է��Ͻÿ�.\n");
				scanner.next();
				continue;
			}
		}
		
		scanner.close();

	}

}
