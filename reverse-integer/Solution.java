class Solution {
    public int reverse(int x) {
        try{
        
        if(x>=0)  
        {
             return Integer.valueOf((new StringBuilder(Integer.toString(x)).reverse()).toString());
        }
         else
         {
             String str = String.valueOf(x);
               return Integer.valueOf((new StringBuilder(str.substring(1,str.length())).reverse()).toString())*-1;
         }
       
        
    }
         catch(NumberFormatException nfe) {
            return 0;
        }
    }
}