package programmers_Lv0;

/**
 * <pre>
 * 배열 뒤집기
 *
 * 문제 설명
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록
 * solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ num_list의 길이 ≤ 1,000
 * 0 ≤ num_list의 원소 ≤ 1,000
 *
 * 입출력 예
 * num_list	                result
 * [1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]	  [5, 3, 1, 1, 1, 0, 1]
 * @author RSH
 * </pre>
 */
public class ReverseArray {
  public int[] solution(int[] num_list) {
    int a = num_list.length;
    int[] arr = new int[a];
    for (int i = 0; i < num_list.length; i++) {
      arr[a - 1 - i] = num_list[i];
    }
    return arr;
  }
}