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
			System.out.print("나라와 수도 입력"+ (V.size()+1) +">>");
			String X = scanner.next();
			if(X.equals("그만"))
				break;
			String Y = scanner.next();
			P = new Nation(X,Y);
			for(i = 0;i<V.size();i++) {
				Nation p = (Nation) V.get(i);
				if(X.equals(p.country)) {
					System.out.print(X +"는 이미 있습니다!!\n");
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
			
			System.out.print(P.country +"의 수도는? >>");
			X = scanner.next();
			if(X.equals("그만"))
				break;
			if(X.equals(P.capital))
				System.out.print("정답!!\n");
			else
				System.out.print("아닙니다 !!\n");
		}
	}
	
	
	
	public static void main (String[] args) {
		int opt=0;
		Scanner scanner = new Scanner(System.in);
		Vector <Nation> V = new Vector <Nation>();
		
		V.add(new Nation("중국","베이징"));
		V.add(new Nation("일본","도쿄"));
		V.add(new Nation("한국","서울"));
		V.add(new Nation("그리스","아테네"));
		V.add(new Nation("네덜란드","암스테르담"));
		V.add(new Nation("독일","베를린"));
		V.add(new Nation("벨기에","브뤼셀"));
		V.add(new Nation("스웨덴","스톡홀름"));
		V.add(new Nation("스페인","마드리드"));
		
		
		System.out.print("******수도 맞추기 게임을 시작합니다******\n");
		
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
			opt = scanner.nextInt();
	
			if(opt == 1) {
				System.out.print("현재 " + V.size() + "개의 나라와 수도가 입력되어있습니다.\n");
				opt1(V);
			}
			else if (opt == 2) {
				opt2(V);
			}
			else if (opt == 3) {
				System.out.print("게임을 종료합니다.\n");
				break;
			}
		}
		
	}
}
