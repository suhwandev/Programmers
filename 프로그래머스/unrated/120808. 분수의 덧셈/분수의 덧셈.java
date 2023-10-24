class Solution {
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