import java.util.Hashtable;
class Solution {
    public String intToRoman(int num) {
        Hashtable romanTable = new Hashtable();

        romanTable.put(1,"I");
        romanTable.put(5,"V");
        romanTable.put(10,"X");
        romanTable.put(50,"L");
        romanTable.put(100,"C");
        romanTable.put(500,"D");
        romanTable.put(1000,"M");

       

       return  findRomanValue(num,romanTable);

        
    }
     private  String findRomanValue(int number, Hashtable romanTable) {

        int num2;
        int i=10;
        String romanString ="";
        while (number!=0)
        {
            num2 = number%i;
            number = number/i;
            number = number*i;
            romanString = romanString+findRoman(num2,i,romanTable);
            i=i*10;
        }
        String roman = new StringBuffer(romanString).reverse().toString();
        return roman;
     }
     private String findRoman(int number, int i, Hashtable romanTable)
    {
        String s="";
        int j=i/10;
        int newNum = number/j;
        if(number/j<4)
        {
            for(int k=0;k<newNum;k++)
            {
                s=s+romanTable.get(j);
            }
        }
        else if(number/j==4)
        {
           s=s+romanTable.get(5*j)+romanTable.get(j);
        }
        else if(number/j==5)
        {
            int value =5*j;
            s=s+romanTable.get(value);
        }
        else if(number/j<9)
        {
           
            for(int k=5;k<newNum;k++)
            {
                s=s+romanTable.get(j);
            }
            s=s+romanTable.get(5*j);
        }
        else if(number/j==9)
        {
            s=s+romanTable.get(i)+romanTable.get(j);
        }
        else if(number/j==10)
        {
           s=s+romanTable.get(number/j);
        }

        return s;
    }
}