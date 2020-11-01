package stringex2;
import java.io.*;

public class StringEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int sum = 0;
		
		for(byte a : br.readLine().getBytes())   // getBytes = String (���ڿ�) �� ���Ͽ� �ش� ���ڿ��� �ϳ��� byte �迭�� ��ȯ���ִ� �޼ҵ��.
		{
			sum += (a - '0'); 						/* getBytes() �� ���ڿ���  byte �迭�� ��ȯ�Ѵٰ� �ߴ�. 
											��, readLine() ���� �о���� ���ڸ� byte[] �� ��ȯ�Ͽ� ��ȯ�ǹǷ� for-each ������ ���� ���ڿ��� ���ڸ� �ϳ��ϳ��� �о���� �� �ִ�.
											�̶� ���ߵ��� UTF-16 ���ڵ��� �°� �� ������ ���� �����ϹǷ� �ݵ�� '0' �Ǵ� 48 �� ���־�� �Ѵ�. */
		}
		
		System.out.println(sum);

	}

}