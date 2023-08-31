package programmers_Lv0;

import java.util.Arrays;

/**
 * <pre>
 * 짝수 홀수 개수
 *
 * 문제 설명
 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 100
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예
 * num_list	        result
 * [1, 2, 3, 4, 5]	[2, 3]
 * [1, 3, 5, 7]	        [0, 4]
 * @author RSH
 * </pre>
 */
public class EvenOddNums {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5};
    System.out.println(solution(nums));
  }

  public static int[] solution(int[] num_list) {
    int[] answer = new int[2];
    int evenCounter = 0;
    int oddCounter = 0;

    // for로 num_list의 배열을 훑어서 각각의 값의 홀짝을 판별함
    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        evenCounter++;
        answer[0] = evenCounter;
      } else {
        oddCounter++;
        answer[1] = oddCounter;
      }
    }
    return answer;
  }
}
