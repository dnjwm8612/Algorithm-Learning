class Solution {
    public String solution(String X, String Y) {
        String answer = "-1";
        StringBuilder sb = new StringBuilder();
        
        int[] xCheck = new int[10];
        int[] yCheck = new int[10];
        
        for(int i = 0; i < X.length(); i++){
            xCheck[X.charAt(i) - '0']++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            yCheck[Y.charAt(i) - '0']++;
        }
        
        for(int i = 9; i >= 0; i--){
            if(yCheck[i] != 0 && xCheck[i] != 0){
                System.out.println("i:" + i);
                int length = Math.min(yCheck[i], xCheck[i]);
                
                for(int j = 0; j < length; j++){
                    if(i == 0 && sb.length() == 0){
                        sb.append(0);
                        break;
                    }
                    
                    sb.append(i);
                }
            }
        }
        
        
        if(sb.length() > 0){
            answer = sb.toString();
        }
        
        return answer;
    }
}