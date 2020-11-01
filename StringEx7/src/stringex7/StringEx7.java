package stringex7;
import java.io.*;
import java.util.*;

public class StringEx7 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		
	/*	StringBuilder 는 문자열을 다루는 클래스로 많이 쓰이고 있는데, 여기서 reverse() 라는 아주 좋은 메소드를 포함하고 있다.
		즉, 위를 사용하기 위해 먼저 StringBuilder 생성과 동시에 append() 라는 메소드에 값을 넣어준다.
		이때 append() 로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환된다. 
		그리고 그렇게 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면 끝이다.
		그리고 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경시키면 끝이다. 
		Scanner 을 사용했을 때는 int 타입으로 받았기 때문에 객체를 생성할 때 append() 메소드를 써야했지만 만약 넣어주려는 인자가 String 타입이면 append() 를 사용할 필요가 없다. */
			
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A : B);

	}

}