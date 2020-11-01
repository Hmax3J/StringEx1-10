package stringex3;
import java.io.*;

public class StringEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = -1;
		}
		
		String S = br.readLine();
		 
		for(int i = 0; i < S.length(); i++) 
		{
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) 
			{	// arr ���� ���� -1 �� ��쿡�� �ʱ�ȭ
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) 
		{	// �迭 ���
			System.out.print(val + " ");
		}
		
	}

}