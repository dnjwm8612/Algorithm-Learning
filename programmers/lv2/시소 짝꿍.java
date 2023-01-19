import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < weights.length; i++){
            if(!map.containsKey(weights[i])){
                List<Integer> nList = new ArrayList<>();
                nList.add(i);
                map.put(weights[i], nList);
            }else{
                map.get(weights[i]).add(i);
            }
            
            set.add(weights[i]);
        }
        
        for(int key : set){
            
            long count = map.get(key).size();
            
            int numX2 = key * 2;
            if(numX2 % 3 == 0){
                if(map.containsKey(numX2 / 3)){
                    answer += (long)map.get(numX2 / 3).size() * count;
                }
            }
            
            if(numX2 % 4 == 0){
                if(map.containsKey(numX2 / 4)){
                    answer += (long)map.get(numX2 / 4).size() * count;
                }
            }
            
            int numX3 = key * 3;
            if(numX3 % 2 == 0){
                if(map.containsKey(numX3 / 2)){
                    answer += (long)map.get(numX3 / 2).size() * count;
                }
            }
            
            if(numX3 % 4 == 0){
                if(map.containsKey(numX3 / 4)){
                    answer += (long)map.get(numX3 / 4).size() * count;
                }
            }
            
            int numX4 = key * 4;
            if(numX4 % 2 == 0){
                if(map.containsKey(numX4 / 2)){
                    answer += (long)map.get(numX4 / 2).size() * count;
                }
            }
            
            if(numX4 % 3 == 0){
                if(map.containsKey(numX4 / 3)){
                    answer += (long)map.get(numX4 / 3).size() * count;
                }
            }
            
            if(count > 1){
                answer += count * (count - 1) / 2;
            }
            
            map.remove(key);        
        }
        
        return answer;
    }
}