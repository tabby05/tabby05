package day1;

public class Main {	// 버블 정렬 예제
	public static void main(String[] args) {
		int[] arr = {6, 5, 4, 32, 1, 78, 9};	// 배열 선언 및 값 대입
		int i, j, temp;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];		// temp에 j 대입
					arr[j] = arr[j+1];	// j에 j+1 대입
					arr[j+1] = temp;	// j+1에 temp 대입
				}
			}
		}
		System.out.print("결과값: ");
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		// 배열 arr 출력
		}
	}
}
