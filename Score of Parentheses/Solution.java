import java.util.Stack;
class Solution
{
    public int scoreOfParentheses(String S)
    {
        
         int length = S.length();
        int sum=0;
        if(length%2!=0)
        {
          
            return 0;
        }
        Stack stringStack = new Stack();
        for(int i=0;i<length;i++)
        {
            char c = S.charAt(i);

            if(c=='(')
            {
                stringStack.push(c);
            }
            else if(c==')') //closing bracket cases
            {

               if(stringStack.peek() instanceof Character && (char)stringStack.peek()=='(')
               {
                   stringStack.pop();
                   stringStack.push(1);
               }
               else
               {
                   int num =0;

                   while (stringStack.peek() instanceof Integer)
                   {
                       num = num+(int)stringStack.pop();

                   }
                   if(stringStack.peek() instanceof Character)
                   {
                       if((char)stringStack.peek()=='(') {
                           stringStack.pop();
                           stringStack.push(2 * num);
                       }
                       else
                       {
                           
                           return 0;
                       }
                   }

               }

            }


        }

        while (!stringStack.isEmpty())
        {
        {
            sum =sum+(int)stringStack.pop();
        }
       return sum;
        
    }
}