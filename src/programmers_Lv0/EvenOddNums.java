package Lv0;

/**
 * <pre>
 * 짝수 홀수 개수
 *
 * 문제 설명
 * 정수가 담긴 리스트 num_list가 주어질 때,
 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 100
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예
 * num_list	        result
 * [1, 2, 3, 4, 5]	[2, 3]
 * [1, 3, 5, 7]	        [0, 4]
 *
 * </pre>
 *
 */
public class EvenOddNums {
  public static void main(String[] args) {
    int[] num = {1, 2, 3, 4, 5};
    System.out.println(solution(num));
  }

  //짝수와 홀수의 개수를 세고, 이를 결과 배열에 저장하여 반환하는 메서드
  public static int[] solution(int[] num_list) {
    // 결과를 담을 배열 생성
    int[] answer = new int[2];
    // 짝수 개수 카운트 변수 초기화
    int evencounter = 0;
    // 홀수 개수 카운트 변수 초기화
    int oddcounter = 0;

    // 입력 배열을 순회
    for (int i = 0; i < num_list.length; i++) { // 입력 배열을 순회
      if (num_list[i] % 2 == 0) {
        evencounter++;
        // 결과 배열의 인덱스 0에 짝수 개수 저장
        answer[0] = evencounter;
      } else {
        oddcounter++;
        // 결과 배열의 인덱스 1에 홀수 개수 저장
        answer[1] = oddcounter;
      }
    }
    // 최종 결과 배열 반환
    return answer;
  }
}