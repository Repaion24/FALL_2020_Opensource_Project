import java.util.Scanner;
import java.util.Vector;


class Nation{
	public String country;
	public String capital;
	
	public Nation(String X, String Y) {
		this.country = X;
		this.capital = Y;
	}
}




public class project1 {
	
	public static void opt1(Vector V) {
		int i=0;
		Nation P;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("����� ���� �Է�"+ (V.size()+1) +">>");
			String X = scanner.next();
			if(X.equals("�׸�"))
				break;
			String Y = scanner.next();
			P = new Nation(X,Y);
			for(i = 0;i<V.size();i++) {
				Nation p = (Nation) V.get(i);
				if(X.equals(p.country)) {
					System.out.print(X +"�� �̹� �ֽ��ϴ�!!\n");
					break;
				}
			}
			if(i == V.size()) {
				V.add(new Nation(X,Y));
			}
		}
	}
	
	public static void opt2(Vector V) {
		Scanner scanner = new Scanner(System.in);
		Nation P;
		String X;
		
		while(true) {
			int num = (int) (Math.random()*V.size());
			P = (Nation) V.get(num);
			
			System.out.print(P.country +"�� ������? >>");
			X = scanner.next();
			if(X.equals("�׸�"))
				break;
			if(X.equals(P.capital))
				System.out.print("����!!\n");
			else
				System.out.print("�ƴմϴ� !!\n");
		}
	}
	
	
	
	public static void main (String[] args) {
		int opt=0;
		Scanner scanner = new Scanner(System.in);
		Vector <Nation> V = new Vector <Nation>();
		
		V.add(new Nation("�߱�","����¡"));
		V.add(new Nation("�Ϻ�","����"));
		V.add(new Nation("�ѱ�","����"));
		V.add(new Nation("�׸���","���׳�"));
		V.add(new Nation("�״�����","�Ͻ��׸���"));
		V.add(new Nation("����","������"));
		V.add(new Nation("���⿡","���"));
		V.add(new Nation("������","����Ȧ��"));
		V.add(new Nation("������","���帮��"));
		
		
		System.out.print("******���� ���߱� ������ �����մϴ�******\n");
		
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3 >>");
			opt = scanner.nextInt();
	
			if(opt == 1) {
				System.out.print("���� " + V.size() + "���� ����� ������ �ԷµǾ��ֽ��ϴ�.\n");
				opt1(V);
			}
			else if (opt == 2) {
				opt2(V);
			}
			else if (opt == 3) {
				System.out.print("������ �����մϴ�.\n");
				break;
			}
		}
		
	}
}
