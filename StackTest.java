package day7;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 입력할 수
		
		for(int i = 0; i < n; i++) {	// 입력한 수만큼
			String input1 = sc.next();	// 명령 수행
			
			if(input1.equals("push")) {
				int input2 = sc.nextInt();	// push할 수
				stack.push(input2);			// 입력한 수를 push
			} 
			else if(input1.equals("pop")) {	
				System.out.println(stack.isEmpty()?-1:stack.pop());	// isEmpty(스텍이 비어있을 경우)가 참일 경우에 -1, 거짓일 경우 pop
			} 
			else if(input1.equals("size")) {
				System.out.println(stack.size());					// 배멸의 크기 출력
			} 
			else if(input1.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);			// (조건?a:b) 조건이 참일 경우 a, 거짓일 경우 b를 수행
			} 
			else if(input1.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());// 스텍의 가장 위의 항목을 반환
			}
		}
	}
}
/*pop(): 스택에서 가장 위에 있는 항목을 제거한다.
push(item): item 하나를 스택의 가장 윗 부분에 추가한다.
peek(): 스택의 가장 위에 있는 항목을 반환한다.
isEmpty(): 스택이 비어 있을 때에 true를 반환한다.*/