public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (; n > 0; n /= 10) { answer += n % 10; }
    return answer; }
}