class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
       String [] morseChars =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet morseSet =  new HashSet();
                
        
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            String morseCode = "";
            for(int j=0;j<word.length();j++)
            {
                morseCode = morseCode + morseChars[(word.charAt(j)-'a')];
            }
            
            if(!morseSet.contains(morseCode))
            {
                morseSet.add(morseCode);
            }           
            
        }
        
        return morseSet.size();
        
        
    }
}