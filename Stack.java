package day6;

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// ����� ��
		int[] arr = new int[n];		// �۾��� ���� �迭
		int top = -1;				// ó�� ��ġ
		String input;				// ���
		
		for(int i = 0; i<n; i++) {	// �Է��� ����ŭ ��� ����
			input = sc.next();		// ��� �Է�
			
			if(input.equals("push")) {	// ������ ���ؿ� �ִ� ����
				top++;					// ������ �ϳ� �߰� �Ǽ� �迭 index�� 1�� �þ.
				arr[top] = sc.nextInt();
			} 
			else if(input.equals("pop")) {	// ���ؿ��� ���� ���� ������ ����, �� ���� ���
				if(top == -1) {
					System.out.println(-1);	// ������ ���� ��� -1 ���
				} else {
					System.out.println(arr[top]);
					top--;					// ������ �ϳ� ���������Ƿ� �迭 index�� 1�� �پ��.
				}
			} 
			else if(input.equals("size")) {	// ���ؿ� ����ִ� ������ ������ ���
				System.out.println(top + 1);
			} 
			else if(input.equals("empty")) {	// ������ ������� ��� 1, �ƴϸ� 0�� ���
				if(top == -1) {
					System.out.println(1);		// ������ ������� ���
				} else {
					System.out.println(0);		// ������ ������ ���
				}
			} 
			else if(input.equals("top")) {		// ������ ���� ���� �ִ� ������ ���
				if(top == -1) {
					System.out.println(-1);		// ������ ������� ��� -1 ���
				} else {
					System.out.println(arr[top]); // ������ ���� ���� �ִ� ������ ���
				}
			}
		}
	}
}

/*������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

push X: ���� X�� ���ÿ� �ִ� �����̴�.
pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.*/
