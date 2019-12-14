class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        
           
        int n1 = arr1.length;
        int n2 =  arr2.length;
        if(n1==0&&n2==0)
        {
            return 0;
        }
        
        int arr3[] = new int[(n1+n2)];
        
         int i = 0, j = 0, k = 0;
     
        while (i<n1 && j <n2)
        {
            
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
           
        }
        
     
        // Store remaining elements of first array
        while (i < n1)
        {
            arr3[k++] = arr1[i++];
        }
     
        // Store remaining elements of second array
        while (j < n2)
        {
            arr3[k++] = arr2[j++];
        
        }
         if(k%2 == 1) return arr3[k/2];
    else return (arr3[k/2]+arr3[k/2 - 1])/2.0;
        
    }
    
}