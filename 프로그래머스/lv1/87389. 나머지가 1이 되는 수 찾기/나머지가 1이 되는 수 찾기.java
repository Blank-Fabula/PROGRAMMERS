class Solution {
    public int solution(int n) {
        int answer = 2;
        for (; answer < n; answer++) {
            if (n % answer == 1) { break; }
        }
    return answer; }
}