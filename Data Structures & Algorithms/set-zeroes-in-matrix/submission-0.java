class Solution {
    public void setZeroes(int[][] matrix) {

        int row=matrix.length;
        int col=matrix[0].length;

        boolean first_row=false;
        boolean first_col=false;


        // 1st step : check the first row and first col if they contain any zero


             // for 1st row
        for(int j=0;j<col;j++){

            if(matrix[0][j]==0) 
            {
                first_row=true;
                break;
            }
        }
             // first col
         for(int i=0;i<row;i++){

            if(matrix[i][0]==0) {
            first_col=true;
            break;
            }
        }
        
    // 2nd step : check from 2nd row and 2nd col if they have zero then 
    // set the start of that row and start of that col as zero.

        for(int i=1;i<row;i++){
             for(int j=1;j<col;j++){

                if(matrix[i][j]==0){
                    matrix[i][0]=0;  // start of the row 
                    matrix[0][j]=0;  //start of the col
                }
             }
        }

        //3rd step : according to the markers in the 2nd step(which has to on first col and first row)
        //,set the respective col and row zero
        //except 1st and 2nd

                for(int i=1;i<row;i++){
                    for(int j=1;j<col;j++){
                         if(matrix[i][0]==0 || matrix[0][j]==0){
                            matrix[i][j]=0;
                         }
                    }
                }
   // final step if our first row is true, which means  first row has 0
   //same check for 1st col

   if(first_row==true){
    for(int j=0;j<col;j++){
        matrix[0][j]=0;
    }
   }

  if(first_col==true){
    for(int i=0;i<row;i++){
        matrix[i][0]=0;
    }
   }

    }
}
