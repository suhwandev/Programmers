class Solution {
    public int solution(int n, int k) {
    int answer = 0;
    if (n < 10) {
      k = k;
    } else if (n == 10) {
      k = k - 1;
    } else {
      k = k - n / 10;
    }
    answer = n * 12000 + k * 2000;
    return answer;
  }
}