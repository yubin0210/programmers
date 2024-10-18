class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum = String.valueOf(a) + String.valueOf(b);
        int mult = 2 * a * b;
        if(Integer.parseInt(sum) >= mult) {
            answer = Integer.parseInt(sum);
        } else {
          answer = mult;  
        }
        return answer;
    }
}