class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = (int)Math.sqrt(n); i > 0; i--) {
            if (n % i == 0) { answer += i + n / i; }
        } if (n % Math.sqrt(n) == 0) { answer -= Math.sqrt(n); }
    return answer; }
}