import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;



public class project2 {
	
	public static void opt1(HashMap V) {
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("����� ���� �Է�"+ (V.size()+1) +">>");
			String X = scanner.next();
			if(X.equals("�׸�"))
				break;
			String Y = scanner.next();
			if(V.containsKey(X)) {
				System.out.print(X +"�� �̹� �ֽ��ϴ�!!\n");
			}
			else {
				V.put(X, Y);
			}
		}
	}
	
	public static void opt2(HashMap V) {
		Scanner scanner = new Scanner(System.in);
		String X;
		
	    Iterator<String> iter = V.keySet().iterator();
		
		
		while(true) {
			String keys = (String) iter.next();

			
			System.out.print(keys +"�� ������? >>");
			X = scanner.next();
			if(X.equals("�׸�"))
				break;
			if(X.equals(V.get(keys)))
				System.out.print("����!!\n");
			else
				System.out.print("�ƴմϴ� !!\n");
		}
	}
	
	
	
	public static void main (String[] args) {
		int opt=0;
		Scanner scanner = new Scanner(System.in);
		HashMap <String,String> V = new HashMap <String, String>();
		
		V.put("�߱�","����¡");
		V.put("�Ϻ�","����");
		V.put("�ѱ�","����");
		V.put("�׸���","���׳�");
		V.put("�״�����","�Ͻ��׸���");
		V.put("����","������");
		V.put("���⿡","���");
		V.put("������","����Ȧ��");
		V.put("������","���帮��");
		
		
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
