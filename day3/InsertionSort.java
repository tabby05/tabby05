package day3;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 3};		// �迭 ����
		int temp, j, i;
		
		for(i = 1 ; i < arr.length; i ++) {
			temp = arr[i];		// ������ ���� temp�� ����
			for(j = i - 1; j >= 0 && arr[j] > temp; j--) { 	// ���� ���� ���ĵ� ���麸�� ���� ���
				arr[j+1] = arr[j];							// ���� �ٲ��ش�
			}
			arr[j+1] = temp;
		}
		System.out.print("�����: ");
		for(i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i] + " ");		// ���ĵ� �迭 ���
		}

	}
}
