import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int count =0;
        if(J.length() ==0 || S.length() ==0)
        {
            return count;
        }
        
        HashSet distincSet = new HashSet();
        
       for(int k=0;k<J.length();k++)
       {
           distincSet.add(Character.toString(J.charAt(k)));
       }
        
       for(int i=0;i<S.length();i++)
       {
           if(distincSet.contains(Character.toString(S.charAt(i))))
           {
                count++;
           }
       }
        
        
        return count;
    }
}