class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;
        int sLength = s.length();
        int pCount = 1, cCount = 0;
        
        for(int i = 1; i < sLength; i++){
            if(s.charAt(index) == s.charAt(i)){
                pCount++;
            }else{
                cCount++;
            }
            
            if(pCount == cCount){
                answer++;
                pCount = 1;
                cCount = 0;
                
                index = i + 1;
                i = index;
            }
        }
        
        if(index < sLength){
            answer++;
        }
        
        return answer;
    }
}