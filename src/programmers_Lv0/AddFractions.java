package programmers_Lv0;

/**
 * <pre>
 * 분수의 덧셈
 * 문제 설명
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록
 * solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 *
 * 입출력 예
 * numer1	denom1	numer2	denom2	 result
 *  1	    2	    3 	    4 	  [5, 4]
 *  9			2      1      3    [29, 6]
 * @author RSH
 * </pre>
 */
class AddFractions {
  public static void main(String[] args) {
    AddFractions a = new AddFractions();
    System.out.println(a.solution(1, 2, 3, 4));
  }

  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int num = numer1 * denom2 + numer2 * denom1;  // 분자 통분
    int denom = denom1 * denom2;                  // 분모 통분

    //기약분수로 나타나기 위한 최대공약수를 선언
    int max = 1;

    for (int i = 1; i <= num && i <= denom; i++) {
      if (denom % i == 0 && num % i == 0) {
        max = i;
      }
    }
    num = num / max;
    denom = denom / max;

    int[] answer = {num, denom};
    return answer;
  }
}