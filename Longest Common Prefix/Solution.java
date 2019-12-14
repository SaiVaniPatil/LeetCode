class Solution {
    public String longestCommonPrefix(String[] strArray) {
        
       
        boolean canbreak = false;
        String commonString = "";
        if(strArray.length==0)
        {
            return commonString;
        }
        
         int minLength = strArray[0].length();

        for(int i=1;i<strArray.length;i++)
        {
            minLength = Math.min(minLength,strArray[i].length());
        }
        for(int j=0;j<minLength;j++)
        {
            for(int i=0;i<(strArray.length-1);i++)
            {
                if(strArray[i].charAt(j)!=strArray[i+1].charAt(j))
                {
                    canbreak =true;
                }
                if(canbreak)
                {
                    break;
                }


            }
            if (canbreak)
            {
                break;
            }
            commonString = commonString+strArray[0].charAt(j);
        }

        return commonString;
        
    }
}