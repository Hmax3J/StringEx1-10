package stringex6;
import java.io.*;
import java.util.*;

public class StinrgEx6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," "); // st �� ������ �������� ���� ��ū���� st �� �����Ѵ�
		
		System.out.print(st.countTokens()); // countTokens() �� ��ū�� ������ ��ȯ�Ѵ�

	}

}