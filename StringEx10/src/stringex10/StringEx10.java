package stringex10;
import java.io.*;

public class StringEx10 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int count = 0; // 메인에서는 먼저 그룹단어 개수를 셀 count 변수를 생성한다. 
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) // 또한 N 을 받고 그룹 단어 체크 함수를 N 번 돌릴 것이기 때문에 반복문을 써줄 것이다.
		{
			if (check() == true) // 그리고 check 메소드를 호출하여 만약 check 메소드가 true 라면 count 를 1 증가시킨다. 
			{
				count++;
			}
		}
		System.out.println(count); // 그리고 반복문이 끝나면 count 변수를 출력한다.
	}
 
	public static boolean check() throws IOException { // 그룹 단어를 체크할 함수다. 단어가 입력되면 해당 문자열이 그룹 단어인지 아닌지만 따지면 되기 때문에 return 타입은 boolean 으로 한다.
		
		boolean[] check = new boolean[26]; // 26 개의 단어를 체크 할 길이 26의 boolean 배열을 선언하고 문자열을 입력받는다.
		int prev = 0; /* 알고리즘에서 가장 중요하게 작용할 변수 prev 를 생성한다. prev 의 역할은 이후 반복문에서 문자를 꺼내올 때 앞선 문자와 연속되는지, 아닌지를 판별하기 위함이다. 즉, 아래와 같이 돌아가도록 할 것이다.
		prev 의 문자와 해당 문자가 같다면? → 해당 문자가 중복된 문자인지 여부를 검사하지 않는다. (boolean 배열) 
		prev 의 문자와 해당 문자가 다르다면? → 해당 문자가 중복된 문자인지 여부를 검사한다. (boolean 배열) */
		String str = br.readLine(); 
		
		for(int i = 0; i < str.length(); i++) // 입력받은 문자열을 이제 하나씩 꺼내서 그룹 단어인지 아닌지를 검사해야한다. 이를 위해 문자열의 길이만큼 반복문을 써주자.
		{
			int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)
			
		/*	이제 반복문 안에 charAt( ) 을 통해 문자열의 문자들을 하나씩 꺼내와서 해당 단어가 prev 의 값과 같은지 판별해준다. 이때 앞서 설명한 것처럼 조건문을 써야한다.
		  prev 의 문자와 해당 문자가 같다면?  → 해당 문자가 중복된 문자인지 여부를 검사하지 않는다. (boolean 배열)
		  prev 의 문자와 해당 문자가 다르다면? → 해당 문자가 중복된 문자인지 여부를 검사한다. (boolean 배열) */
			
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if (prev != now) 
			{		
				
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if ( check[now - 'a'] == false ) 
				{
					check[now - 'a'] = true;		// true 로 바꿔준다
					prev = now;					// 다음 턴을 위해 prev 도 바꿔준다 
				}
	 
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else 
				{
					return false;	//함수 종료
				}
			}
	        
	        
			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
			// else 문은 없어도 됨
			else 
			{
				continue;
			}
		}    
		return true;
	/*	일단 prev 문자와 검사할 문자인 now 가 다른 경우 (비연속 문자인 경우), 즉 이전의 문자와 현재 문자가 다른 경우에 check 배열에서 해당 문자가 중복되는지를 살펴보는 것이다.
	  예로들어 a a b a 라는 문자를 입력받아고 생각해보자. 
	  맨 처음 'a' 는 int 값으로 97 이니 처음 prev 초기값 0 하고는 다르므로 check[0] 배열에 true 로 바뀌게 된다.( 참고로 boolean 배열은 디폴트 값(초기값)이 false 다. )
	  또한 prev 도 97 ('a') 로 바뀐다. 그리고 다음문자는 'a' 다. 이 때 prev 와 'a' 는 97 로 같기 때문에 아무 일도 없이 건너뛴다.
		다음 문자는 'b' 다. 이 때 prev 와 'b' 는 서로 다른 값이므로 조건문을 실행하게 된다.
		check[1] 은 false 이므로 해당 원소를 true 로 바꾸어 주고, prev 또한 98 ('b') 로 바뀌게 된다. 마지막 문자는 'a' 다.
		prev 에는 98 이 저장되어 있고, 'a' 는 97 이므로 서로 다른 값을 갖고 있기에 조건문을 실행시키게 된다.
		이 때 check[0] 은 이미 true 다. 즉, 앞서 이미 나온 적이 있는 문자이기 때문에 그룹 단어가 아니므로 바로 함수를 종료시키고 false 를 return 하는 것이다. */

	}

}