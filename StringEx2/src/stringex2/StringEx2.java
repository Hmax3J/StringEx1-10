package stringex2;
import java.io.*;

public class StringEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int sum = 0;
		
		for(byte a : br.readLine().getBytes())   // getBytes = String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드다.
		{
			sum += (a - '0'); 						/* getBytes() 는 문자열을  byte 배열로 반환한다고 했다. 
											즉, readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
											이때 말했듯이 UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다. */
		}
		
		System.out.println(sum);

	}

}