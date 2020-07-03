package day5;

import java.util.Scanner;

public class WoodPiece {
	
	private static void swap(int[] arr, int i1, int i2) {	// �� ���� ��ġ�� �ٲ��ִ� �Լ� swap
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	private static void print(int[] arr) {
		for(int j : arr) {				// Ȯ�� for�� (���� ���� : �迭 �̸�) �迭�� ���� ��ŭ �ݺ�
			System.out.print(j + " ");	// �迭 ���
		}
	}
	
	private static void bubble(int[] arr) {			// ���� ������ �ϴ� �Լ� bubble
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {			// ���� ���� ���� ������ Ŭ ���
					swap(arr, j, j+1);				// ���� �ٲ��ش�.
					print(arr);						// �迭 ���
					System.out.println();			// �ٹٲ�
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// ���� �Է��� �� ��
		int[] arr = new int[5];						// ���̰� 5�� �迭�� ����
		
		for(int i = 0; i < arr.length; i++) {		// �迭�� ���� ��ŭ
			arr[i] = sc.nextInt();					// �Է�
		}
		
		bubble(arr);	// �迭 ���� �� ��� �Լ�
	}
}
/*���� ���� - 2947
�����̴� ���� ������ 5�� ������ �ִ�. ���� �������� 1���� 5���� ���� �� �ϳ��� ������ �ִ�. ��, ��� ���ڴ� �ټ� ���� �� �ϳ����� ���� �ִ�.
�����̴� ���� ������ ������ ���� ������ ���ļ� 1, 2, 3, 4, 5 ������ ������� �Ѵ�.

ù ��° ������ ���� �� ��° ������ ũ�ٸ�, ���� ��ġ�� ���� �ٲ۴�.
�� ��° ������ ���� �� ��° ������ ũ�ٸ�, ���� ��ġ�� ���� �ٲ۴�.
�� ��° ������ ���� �� ��° ������ ũ�ٸ�, ���� ��ġ�� ���� �ٲ۴�.
�� ��° ������ ���� �ټ� ��° ������ ũ�ٸ�, ���� ��ġ�� ���� �ٲ۴�.
���� ������ 1, 2, 3, 4, 5 ������ �ƴ϶�� 1 �ܰ�� �ٽ� ����.
ó�� ������ ������ �־����� ��, ��ġ�� �ٲ� �� ���� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/