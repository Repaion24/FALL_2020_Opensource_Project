import java.util.Scanner;
import java.io.*;
import java.io.File;

public class test {
	
	
	public static void main (String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String name;
		String what;
		String s;
		int lineNumber = 1;
		
		System.out.print("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.\n");
		
		System.out.print("대상 파일명 입력>>");
		name = scanner.nextLine();
		
		FileInputStream read = new FileInputStream(name);
        InputStreamReader fread = new InputStreamReader(read,"UTF-8");
        BufferedReader in = new BufferedReader(fread);

		
		while(true) {
			System.out.print("검색할 단어나 문장>>");
			what = scanner.nextLine();
			if(what.equals("그만"))
				break;
			while((s = in.readLine()) != null){
                if(s.contains(what))
                	System.out.printf(s + "\n");
            }
			
			read = new FileInputStream(name);
	        fread = new InputStreamReader(read,"UTF-8");
	        in = new BufferedReader(fread);

		}
		System.out.print("종료합니다.\n");
	}
	
}
