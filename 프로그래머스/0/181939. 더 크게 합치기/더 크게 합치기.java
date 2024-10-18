class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sum1 = String.valueOf(a) + String.valueOf(b);
        String sum2 = String.valueOf(b) + String.valueOf(a);
        if(Integer.parseInt(sum1) > Integer.parseInt(sum2)) {
            answer = Integer.parseInt(sum1);
        } else {
            answer = answer = Integer.parseInt(sum2);;
        }
        
        return answer;
    }
}