class TransposeOfMatrix {
    public int[][] transpose(int[][] A) {     
      
        
        int columnLength = A[0].length;
        int rowLength = A.length;
        
        int [][] B = new int[columnLength][rowLength];
        
        for(int i=0;i<columnLength;i++)
        {
            for(int j=0;j<rowLength;j++)
            {   
                B[i][j] = A[j][i];
            }
        }
        return B;
    }
}  