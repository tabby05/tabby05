package day5;

import java.util.Scanner;

public class WoodPiece {
	
	private static void swap(int[] arr, int i1, int i2) {	// 두 값의 위치를 바꿔주는 함수 swap
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
	private static void print(int[] arr) {
		for(int j : arr) {				// 확장 for문 (변수 선언 : 배열 이름) 배열의 길이 만큼 반복
			System.out.print(j + " ");	// 배열 출력
		}
	}
	
	private static void bubble(int[] arr) {			// 버블 정렬을 하는 함수 bubble
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j+1]) {			// 앞의 값이 뒤의 값보다 클 경우
					swap(arr, j, j+1);				// 값을 바꿔준다.
					print(arr);						// 배열 출력
					System.out.println();			// 줄바꿈
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		// 값을 입력할 때 씀
		int[] arr = new int[5];						// 길이가 5인 배열을 선언
		
		for(int i = 0; i < arr.length; i++) {		// 배열의 길이 만큼
			arr[i] = sc.nextInt();					// 입력
		}
		
		bubble(arr);	// 배열 정렬 및 출력 함수
	}
}
/*백준 문제 - 2947
동혁이는 나무 조각을 5개 가지고 있다. 나무 조각에는 1부터 5까지 숫자 중 하나가 쓰여져 있다. 또, 모든 숫자는 다섯 조각 중 하나에만 쓰여 있다.
동혁이는 나무 조각을 다음과 같은 과정을 거쳐서 1, 2, 3, 4, 5 순서로 만들려고 한다.

첫 번째 조각의 수가 두 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
두 번째 조각의 수가 세 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
세 번째 조각의 수가 네 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
네 번째 조각의 수가 다섯 번째 수보다 크다면, 둘의 위치를 서로 바꾼다.
만약 순서가 1, 2, 3, 4, 5 순서가 아니라면 1 단계로 다시 간다.
처음 조각의 순서가 주어졌을 때, 위치를 바꿀 때 마다 조각의 순서를 출력하는 프로그램을 작성하시오.*/