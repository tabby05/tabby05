package day4;

public class MergeSort {
	
	private static void mergeSort(int[] arr) {
		int[] temp = new int[arr.length];	// 배열의 크기 만큼 임시 저장공간 필요
		mergeSort(arr, temp, 0, arr.length - 1);	// 배열을 정렬하는 함수: 정렬할 배열, 임시저장공간, 시작, 끝
	}
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {	// 배열을 정렬하는 함수 (재귀함수)
		if (start < end) {	// start가 end보다 작을 경우에함 재귀 호출
			int mid = (start + end) / 2;		// 배열을 가운데로 잘라야 하므로 가운데 index가 필요.
			mergeSort(arr, temp, start, mid); 	// 배열의 留觀
			mergeSort(arr, temp, mid + 1, end);	// 배열의 뒷부분
			merge(arr, temp, start, mid, end);	// 두개의 배열을 병합
		}
	}
	
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {	// 배열을 병합하는 함수
		for(int i = start; i <= end; i++) {
			temp[i] = arr[i];	// 임시 저장공간에 배열 저장
		}
		int part1 = start;	// 첫 번째 배열의 첫번째 값
		int part2 = mid + 1;	// 두 번째 배열의 첫번째 값
		int index = start;	// 양쪽 배열에서 작은 값을 하나씩 복사할 때마다, 
					// 결과 배열 방에 어디에 저장해야하는지 알아야 하므로 복사 후 하나씩 늘려서
					// 저장할 곳을 기억하고 있도록 함.
		
		while (part1 <= mid && part2 <= end) {		// 첫번째 배열이 끝까지 가거나 두번째 배열이 끝까지 갈 경우
			if(temp[part1] <= temp[part2]) {	// 앞의 값이 작은 경우
				arr[index] = temp[part1];	// 앞의 값을 옮기고
				part1++;			// 앞쪽 포인터를 뒤로 옮김.
			} 
			else {
				arr[index] = temp[part2];	// 뒷쪽 배열에서 가져다가 복사
				part2++;			// 뒷똑 포인터를 뒤로 옮김.
			}
			index++;	// (어느 쪽 배열을 옮기든)index를 하나 늘려줌.
		}
		// 뒷쪽 배열이 비고, 앞쪽 배열에 데이터가 남아있는 경우
		for(int i = 0; i <= mid - part1; i++) {	// 앞쪽 포인터가 배열의 끝에서 남은 만금 돌게 됨.	 
			arr[index + i] = temp[part1 + i];
		}
	}
	
	private static void printArray(int[] arr) {	// 배열을 출력하는 함수
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 4, 3, 6, 5};		// 배열 선언
		printArray(arr);	// 정렬 전 배열 출력
		mergeSort(arr);		// 배열 정렬 함수
		printArray(arr);	// 정렬 후 배열 출력
	}
}
