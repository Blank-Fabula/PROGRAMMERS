import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] cArr = Long.toString(n).toCharArray();
        Arrays.sort(cArr);
        long answer = Long.valueOf((new StringBuilder(new String(cArr))).reverse().toString());
    return answer; }
}