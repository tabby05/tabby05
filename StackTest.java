package day7;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// �Է��� ��
		
		for(int i = 0; i < n; i++) {	// �Է��� ����ŭ
			String input1 = sc.next();	// ��� ����
			
			if(input1.equals("push")) {
				int input2 = sc.nextInt();	// push�� ��
				stack.push(input2);			// �Է��� ���� push
			} 
			else if(input1.equals("pop")) {	
				System.out.println(stack.isEmpty()?-1:stack.pop());	// isEmpty(������ ������� ���)�� ���� ��쿡 -1, ������ ��� pop
			} 
			else if(input1.equals("size")) {
				System.out.println(stack.size());					// ����� ũ�� ���
			} 
			else if(input1.equals("empty")) {
				System.out.println(stack.isEmpty()?1:0);			// (����?a:b) ������ ���� ��� a, ������ ��� b�� ����
			} 
			else if(input1.equals("top")) {
				System.out.println(stack.isEmpty()?-1:stack.peek());// ������ ���� ���� �׸��� ��ȯ��
			}
		}
	}
}
/*pop(): ���ÿ��� ���� ���� �ִ� �׸��� �����Ѵ�.
push(item): item �ϳ��� ������ ���� �� �κп� �߰��Ѵ�.
peek(): ������ ���� ���� �ִ� �׸��� ��ȯ�Ѵ�.
isEmpty(): ������ ��� ���� ���� true�� ��ȯ�Ѵ�.*/