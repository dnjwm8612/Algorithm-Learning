import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        for(int i = food.length - 1; i > 0; i--){
            for(int j = 0; j < food[i] / 2; j++){
                list.addFirst(i);
                list.addLast(i);
            }
        }
        
        for(int i : list){
            sb.append(i);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}