import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;



public class project2 {
	
	public static void opt1(HashMap V) {
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("나라와 수도 입력"+ (V.size()+1) +">>");
			String X = scanner.next();
			if(X.equals("그만"))
				break;
			String Y = scanner.next();
			if(V.containsKey(X)) {
				System.out.print(X +"는 이미 있습니다!!\n");
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

			
			System.out.print(keys +"의 수도는? >>");
			X = scanner.next();
			if(X.equals("그만"))
				break;
			if(X.equals(V.get(keys)))
				System.out.print("정답!!\n");
			else
				System.out.print("아닙니다 !!\n");
		}
	}
	
	
	
	public static void main (String[] args) {
		int opt=0;
		Scanner scanner = new Scanner(System.in);
		HashMap <String,String> V = new HashMap <String, String>();
		
		V.put("중국","베이징");
		V.put("일본","도쿄");
		V.put("한국","서울");
		V.put("그리스","아테네");
		V.put("네덜란드","암스테르담");
		V.put("독일","베를린");
		V.put("벨기에","브뤼셀");
		V.put("스웨덴","스톡홀름");
		V.put("스페인","마드리드");
		
		
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
