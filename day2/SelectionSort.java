package day2;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {3, 4, 2, 1, 5};
		int temp, min;
		
		for(int i = 0; i < arr.length - 1; i++) {
			min = i; 	// 가장 앞의 값
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {		// 선택한 값과 가장 앞의 값을 비교하는 코드
					min = j;
				}
			}
			temp = arr[i];		// 선택한 위치의 값과
			arr[i] = arr[min];	// 최소값을
			arr[min] = temp;	// 교환하는 코드
		}
		System.out.print("결과값: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
