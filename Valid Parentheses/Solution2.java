import java.util.Hashtable;
import java.util.Stack;
class Solution2 {
    public boolean isValid(String s) {
        
         if(s.length()==0 )
        {
            return true;
        }
      
        Hashtable<String,String> bracketsTable = new Hashtable<String,String>();
        bracketsTable.put(")","(");
        bracketsTable.put("}","{");
        bracketsTable.put("]","[");
        bracketsTable.put(">","<");

        Stack<String> strStack = new Stack<String>();
         

        for(int i=0;i<s.length();i++)
        {
            if(bracketsTable.containsKey(String.valueOf(s.charAt(i))))
            {
               if(!strStack.isEmpty() && strStack.peek().equals(bracketsTable.get(String.valueOf(s.charAt(i)))))
                {
                    strStack.pop();
                   
                }
                else
               {
                    strStack.push(String.valueOf( s.charAt(i)));
                    break;
               }
            }
            else
            {
              strStack.push(String.valueOf( s.charAt(i)));
               
            }
        }
        
        return strStack.isEmpty();
    }
}