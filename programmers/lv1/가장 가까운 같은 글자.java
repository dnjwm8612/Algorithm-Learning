import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = -1;
            for(int j = i - 1; j >= 0; j--){
                if(c == s.charAt(j)){
                    index = i - j;
                    break;
                }
            }
            
            list.add(index);
        }
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}