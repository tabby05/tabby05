package day6;

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 명령의 수
		int[] arr = new int[n];		// 작업을 위한 배열
		int top = -1;				// 처음 위치
		String input;				// 명령
		
		for(int i = 0; i<n; i++) {	// 입력한 수만큼 명령 수행
			input = sc.next();		// 명령 입력
			
			if(input.equals("push")) {	// 정수를 스텍에 넣는 연산
				top++;					// 정수가 하나 추가 되서 배열 index가 1개 늘어남.
				arr[top] = sc.nextInt();
			} 
			else if(input.equals("pop")) {	// 스텍에서 가장 위의 정수를 빼고, 그 수를 출력
				if(top == -1) {
					System.out.println(-1);	// 정수가 없는 경우 -1 출력
				} else {
					System.out.println(arr[top]);
					top--;					// 정수가 하나 없어졌으므로 배열 index가 1개 줄어듬.
				}
			} 
			else if(input.equals("size")) {	// 스텍에 들어있는 정수의 갯수를 출력
				System.out.println(top + 1);
			} 
			else if(input.equals("empty")) {	// 스텍이 비어있을 경우 1, 아니면 0을 출력
				if(top == -1) {
					System.out.println(1);		// 스텍이 비어있을 경우
				} else {
					System.out.println(0);		// 스텍이 차있을 경우
				}
			} 
			else if(input.equals("top")) {		// 스텍의 가장 위에 있는 정수를 출력
				if(top == -1) {
					System.out.println(-1);		// 스텍이 비어있을 경우 -1 출력
				} else {
					System.out.println(arr[top]); // 스텍의 가장 위에 있는 정수를 출력
				}
			}
		}
	}
}

/*정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/
