package stinrgex5;
import java.io.*;

public class StringEx5 {

	public static void main(String[] args) throws IOException {
		
		int[] arr = new int[26]; // �������� ������ 26����
		
		int c = System.in.read();
		 
		while (c > 64) 
		{	// ������ �Է¹޴� ���� ����� 
			
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
		int ch = -2;	// ? �� 63 �̴�.
		
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
		
		int[] arr = new int[26]; // �������� ������ 26����
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