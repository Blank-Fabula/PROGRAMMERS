class Solution {
    public String solution(String s) {
        String[] arr_str = s.split(" ");
        int max = Integer.parseInt(arr_str[0]), min = max;
        for (int i = 1; i < arr_str.length; i++) {
            int num = Integer.parseInt(arr_str[i]);
            if (num > max) { max = num;
            } else if (num < min) { min = num; }
        } String answer = min + " " + max;
    return answer; }
}