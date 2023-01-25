import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> boySet = new HashSet<>();
        Set<Integer> girlSet = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
            girlSet.add(topping[i]);
        }
        
        for(int i = 0; i < topping.length - 1; i++) {
            boySet.add(topping[i]);
            
            if(map.get(topping[i]) > 1){
                map.put(topping[i], map.get(topping[i]) - 1);
            }else{
                map.remove(topping[i]);
                girlSet.remove(topping[i]);
            }
            
            if(boySet.size() == girlSet.size()){
                answer++;
            }
        }
        
        return answer;
    }
}