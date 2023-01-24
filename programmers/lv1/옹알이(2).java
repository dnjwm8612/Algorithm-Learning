class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        
        for(String word : babbling){
            word = replaceWords(words, word);
            
            if(word.matches("^[0-9]*$") && successiveCheck(word)){
                answer++;
            }
        }
        
        return answer;
    }
    
    
    public String replaceWords(String[] words, String babyWord){
        for(int i = 0; i < 4; i++){
            babyWord = babyWord.replaceAll(words[i], String.valueOf(i));
        }
        
        return babyWord;
    }
    
    public boolean successiveCheck(String word){
        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(i) == word.charAt(i + 1)){
                return false;
            }
        }
        
        return true;
    }
}