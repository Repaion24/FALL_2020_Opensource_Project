import java.util.Scanner;

public class project1 {
	
	public static int c_length(int n, int m) {
		return n+m;
	}
	
	public static float circle_length(float x1,float x2, float y1,float y2) {
		
		float x_fir = (x1-x2)*(x1-x2);
		float y_fir = (y1-y2)*(y1-y2);
		
		return x_fir + y_fir;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�");
		Scanner cir1 = new Scanner(System.in);
		
		float x1 = cir1.nextFloat();
		float y1 = cir1.nextFloat();
		int c1 = cir1.nextInt();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�");
		Scanner cir2 = new Scanner(System.in);
		
		float x2 = cir2.nextFloat();
		float y2 = cir2.nextFloat();
		int c2 = cir2.nextInt();
		
		int bet = c_length(c1,c2);
		float bet2 = circle_length(x1,x2,y1,y2);
		
		bet = bet*bet;
		
		if (bet < bet2) {
			System.out.println("�� ���� ��ġ�� �ʴ´�");
		}
		else if (bet == bet2) {
			System.out.println("�� ���� �� ������ ������");
		}
		else {
			System.out.println("�� ���� ���� ��ģ��");
		}
		
		cir1.close();
		cir2.close();
		
	}

}
