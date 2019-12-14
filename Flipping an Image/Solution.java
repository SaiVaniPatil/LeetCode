class Solution {
    public int[][] flipAndInvertImage(int[][] A) 
    {
        int rowLength = A.length;
        int columnLength = A[0].length;
        reverseRow(A,rowLength,columnLength);
        invert(A,rowLength,columnLength);
        
        return A;
        
    }
    
    public void reverseRow(int[][] A, int rowLength,int columnLength)
    {
       
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<(columnLength/2);j++)
            {
                int temp =A[i][j];
                A[i][j] = A[i][columnLength-j-1];
                A[i][columnLength-j-1] = temp;
            }
            
        }
    }
    
     public void invert(int[][] A,int rowLength , int columnLength)
    {
        
        for(int i=0;i<rowLength;i++)
        {
            for(int j=0;j<columnLength;j++)
            {
                if(A[i][j] == 0)
                {
                    A[i][j] =1;
                }
                else
                {
                    A[i][j] =0;
                }
            }                       
        }
    }
}