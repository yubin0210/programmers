class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String C = A;
        for(int i = 0; i < A.length(); i++) {
            if(C.equals(B)) {
                return answer;
            }
        String str = C.substring(C.length() - 1);
        C = str + C.substring(0, C.length() - 1);
        answer ++;
        }
        return -1;
    }
}