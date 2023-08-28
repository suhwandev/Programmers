package programmers_Lv0;

import java.util.ArrayList;

/**
 * <pre>
 * 문자열 뒤집기
 *
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은
 * 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력 예
 * my_string	return
 * "jaron"	"noraj"
 * "bread"	"daerb"
 * @author RSH
 * </pre>
 */
public class ReverseString {
  public static void main(String[] args) {
    System.out.println(solution("jason"));
  }
  public static String solution(String my_string) {
    //빈 문자열 reverse 생성
    String reverse = "";
    // length에 my_string의 길이만큼 초기화
    int length = my_string.length();
    // for문 돌면서 my.string을 char 형태의 인덱스별로 잘라서 reverse에 대입
    for (int i = 0; i < length; i++) {
      reverse += my_string.charAt(length - 1 - i);
    }
    // 역순으로 만든 reverse String 리턴
    return reverse;
  }
}





