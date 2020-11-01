package stringex6;
import java.io.*;
import java.util.*;

public class StinrgEx6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," "); // st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
		
		System.out.print(st.countTokens()); // countTokens() 는 토큰의 개수를 반환한다

	}

}