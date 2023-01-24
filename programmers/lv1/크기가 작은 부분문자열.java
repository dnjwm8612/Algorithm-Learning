class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pNum = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - pLength; i++){
            String str = t.substring(i, i + pLength);
                
            if(Long.parseLong(str) <= pNum){
                answer++;
            }
        }
        
        return answer;
    }
}