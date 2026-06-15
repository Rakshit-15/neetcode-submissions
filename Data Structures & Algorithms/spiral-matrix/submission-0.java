class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

                int row=matrix.length;
                int col=matrix[0].length;

           int srow=0,scol=0,erow=row-1,ecol=col-1;

           List<Integer> ans=new ArrayList<>();

           while(srow<=erow && scol<=ecol){

                   //top

                   for(int i=scol;i<=ecol;i++){
                          
                          ans.add(matrix[srow][i]);
                   } 

                   //right

                   for(int i=srow+1;i<=erow;i++){
                          
                          ans.add(matrix[i][ecol]);
                   } 

                   //bottom

                   for(int i=ecol-1;i>=scol;i--){

                    if(srow==erow) break;
                          
                          ans.add(matrix[erow][i]);
                   } 

                   //left

                   for(int i=erow-1;i>=srow+1;i--){

                    if(scol==ecol) break;
                          
                          ans.add(matrix[i][scol]);
                   } 
                  srow++; scol++;erow--;ecol--;


           }
           return ans;
        
    }
}
