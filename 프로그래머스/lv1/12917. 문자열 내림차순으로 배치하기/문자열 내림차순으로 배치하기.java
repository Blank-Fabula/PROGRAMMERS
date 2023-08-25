import java.util.Arrays;

class Solution {
    public String solution(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String answer = new StringBuilder(new String(c)).reverse().toString();
    return answer; }
}