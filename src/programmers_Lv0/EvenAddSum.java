package programmers_Lv0;

import java.sql.SQLOutput;

/**
 * <pre>
 * 짝수의 합
 *
 * 문제 설명
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록
 * solution 함수를 작성해주세요.
 *
 * 제한사항
 * 0 < n ≤ 1000
 *
 * 입출력 예
 * n	  result
 * 10	    30
 * 4	    6
 * @author RSH
 * </pre>
 */
public class EvenAddSum {
  public static void main(String[] args) {
    System.out.println(solution(4));
  }

  public static int solution(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i += 2) {
      sum += i;
    }
    return sum;
  }
}

