package stringex7;
import java.io.*;
import java.util.*;

public class StringEx7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		
	/*	StringBuilder �� ���ڿ��� �ٷ�� Ŭ������ ���� ���̰� �ִµ�, ���⼭ reverse() ��� ���� ���� �޼ҵ带 �����ϰ� �ִ�.
		��, ���� ����ϱ� ���� ���� StringBuilder ������ ���ÿ� append() ��� �޼ҵ忡 ���� �־��ش�.
		�̶� append() �� �־��� ���� Ÿ���� StringBuilder ��� Ÿ������ ��ȯ�ȴ�. 
		�׸��� �׷��� ����� ���� reverse() ��� �޼ҵ带 ���� ����Ǿ��ִ� ���ڿ��� �����´�. �׸��� StringBuilder Ÿ���� ���ڿ��� ��ȯ��Ű�� ���� toString() �� ���ָ� ���̴�.
		�׸��� ���ڿ��� ��ȯ�������� Integer.parseInt() �� String �� int �� Ÿ���� �����Ű�� ���̴�. 
		Scanner �� ������� ���� int Ÿ������ �޾ұ� ������ ��ü�� ������ �� append() �޼ҵ带 ��������� ���� �־��ַ��� ���ڰ� String Ÿ���̸� append() �� ����� �ʿ䰡 ����. */
			
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A : B);

	}

}