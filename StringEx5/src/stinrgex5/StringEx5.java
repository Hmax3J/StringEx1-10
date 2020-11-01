package stinrgex5;
import java.io.*;

public class StringEx5 {

	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		
		int c = System.in.read();
		 
		while (c > 64) 
		{	// 공백을 입력받는 순간 종료됨 
			
			if (c < 91) 
			{
				arr[c - 'A']++;
			} 
			
			else 
			{
				arr[c - 'a']++;
			}
			c = System.in.read();
		}
		
		int max = -1;
		int ch = -2;	// ? 는 63 이다.
		
		for(int i=0; i<26; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				ch = i;
			}
			
			else if(arr[i]==max)
			{
				ch = -2;
			}
		}
		
		System.out.println((char)(ch+65));
		
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) 
		{
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') 
			{
				arr[s.charAt(i) - 97]++;
			} 
			else 
			{
				arr[s.charAt(i) - 65]++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) 
		{
 
			if (arr[i] > max) 
			{
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) 
			{
				ch = '?';
			}
		}
		System.out.print(ch); */
	}

}