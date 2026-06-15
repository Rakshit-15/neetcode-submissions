class Solution {
    public void rotate(int[][] matrix) {


// This code is for square matrix

        // // we need to transpose a matrix then reverse each row
        // //Transpose means matrix[i][j]=matrix[j][i]

        // int row=matrix.length;
        // int col=matrix[0].length;


        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){

        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[j][i];
        //         matrix[j][i]=temp;
        //     }
        // }


        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col/2;j++){

        //         int temp=matrix[i][j];
        //         matrix[i][j]=matrix[i][col-1-j];
        //         matrix[i][col-1-j]=temp;


        //     }
        // }
        

        int m = matrix.length;       // Number of rows in the original matrix
        int n = matrix[0].length;    // Number of columns in the original matrix
        
        // Create a new matrix with swapped dimensions
        int[][] rotatedMatrix = new int[n][m];
        
        // Map each element to its new position in the rotated matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[j][m - 1 - i] = matrix[i][j];
            }
        }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                         
                          matrix[i][j]=rotatedMatrix[i][j];

                }
            }
        
        
    }
}
