package day4;

public class MergeSort {
	
	private static void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];	// �迭�� ũ�� ��ŭ �ӽ� ������� �ʿ�
		mergeSort(arr, temp, 0, arr.length - 1);	// �迭�� �����ϴ� �Լ�: ������ �迭, �ӽ��������, ����, ��
	}
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {	// �迭�� �����ϴ� �Լ� (����Լ�)
		if (start < end) {	// start�� end���� ���� ��쿡�� ��� ȣ��
			int mid = (start + end) / 2;		// �迭�� ����� �߶�� �ϹǷ� ��� index�� �ʿ�.
			mergeSort(arr, temp, start, mid); 	// �迭�� �׺κ�
			mergeSort(arr, temp, mid + 1, end);	// �迭�� �޺κ�
			merge(arr, temp, start, mid, end);	// �ΰ��� �迭�� ����
		}
	}
	
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {	// �迭�� �����ϴ� �Լ�
		for(int i = start; i <= end; i++) {
			temp[i] = arr[i];	// �ӽ� ��������� �迭 ����
		}
		int part1 = start;		// ù ��° �迭�� ù��° ��
		int part2 = mid + 1;	// �� ��° �迭�� ù��° ��
		int index = start;		// ���� �迭���� ���� ���� �ϳ��� ������ ������, 
								// ��� �迭 �濡 ��� �����ؾ��ϴ��� �˾ƾ� �ϹǷ� ���� �� �ϳ��� �÷���
								// ������ ���� ����ϰ� �ֵ��� ��.
		
		while (part1 <= mid && part2 <= end) {	// ù��° �迭�� ������ ���ų� �ι�° �迭�� ������ �� ���
			if(temp[part1] <= temp[part2]) {	// ���� ���� ���� ���
				arr[index] = temp[part1];		// ���� ���� �ű��
				part1++;						// ���� �����͸� �ڷ� �ű�.
			} 
			else {
				arr[index] = temp[part2];	// ���� �迭���� �����ٰ� ����
				part2++;					// �޶� �����͸� �ڷ� �ű�.
			}
			index++;	// (��� �� �迭�� �ű��)index�� �ϳ� �÷���.
		}
		// ���� �迭�� ���, ���� �迭�� �����Ͱ� �����ִ� ���
		for(int i = 0; i <= mid - part1; i++) {	// ���� �����Ͱ� �迭�� ������ ���� ���� ���� ��.	 
			arr[index + i] = temp[part1 + i];
		}
	}
	
	private static void printArray(int[] arr) {	// �迭�� ����ϴ� �Լ�
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 3, 6, 5};	// �迭 ����
		printArray(arr);				// ���� �� �迭 ���
		mergeSort(arr);					// �迭 ���� �Լ�
		printArray(arr);				// ���� �� �迭 ���
	}
}
