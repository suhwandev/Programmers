package programmers_Lv0;

/**
 * <pre>
 * 아이스 아메리카노
 * 문제 설명
 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
 * 아이스 아메리카노는 한잔에 5,500원입니다.
 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을
 * 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < money ≤ 1,000,000
 *
 * 입출력 예
 * money      result
 * 5,500      [1, 0]
 * 15,000    [2, 4000]
 * @author RSH
 * </pre>
 */
public class IcedAmericano {
  public int[] solution(int money) {
    int max = money / 5500;
    int change = money - max * 5500;
    int[] result = new int[2];
    result[0] = max;
    result[1] = change;
    return result;
  }
}
