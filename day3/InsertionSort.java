package day3;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 3};		// 배열 선언
		int temp, j, i;
		
		for(i = 1 ; i < arr.length; i ++) {
			temp = arr[i];		// 삽입할 값을 temp에 저장
			for(j = i - 1; j >= 0 && arr[j] > temp; j--) { 	// 삽입 값이 정렬된 값들보다 작은 경우
				arr[j+1] = arr[j];			// 값을 바꿔준다
			}
			arr[j+1] = temp;
		}
		System.out.print("결과값: ");
		for(i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i] + " ");		// 정렬된 배열 출력
		}

	}
}
