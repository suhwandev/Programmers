package programmers_Lv0;

import java.util.Scanner;

/**
 * <pre>
 * 직각삼각형 출력하기
 *
 * 문제 설명
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성.
 *
 * 제한사항
 * 1 ≤ n ≤ 10
 *
 * 입출력 예
 * 입력 #1
 * 3
 *
 * 출력 #1
 * *
 * **
 * ***
 * @author RSH
 * </pre>
 */
public class RightTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char star = '*';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(star);
      }
      System.out.println();
    }
  }
}

