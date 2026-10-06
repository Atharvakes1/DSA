class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Integer FLAG = new Integer(-12345678); 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int p=0;p<m;p++)
                    {if (matrix[p][j] != 0) {
                            matrix[p][j] = FLAG;
                      
                    }
                    }
                    for(int q=0;q<n;q++)
                    {
                       if(matrix[i][q] != 0) {
                            matrix[i][q] = FLAG;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==FLAG)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}