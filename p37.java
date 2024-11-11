package hw3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p37 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入英文字母");
		
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String str1 = str.toLowerCase();
		
		System.out.println("轉換成大小寫時為"+stru);
		System.out.println("轉換成大小寫時為"+str1);
	}
}
