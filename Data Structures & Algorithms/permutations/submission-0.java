class Solution {
    public List<List<Integer>> permute(int[] nums) {
             List<List<Integer>> ans=new ArrayList<>();

        permCal(0,nums,ans);

        return ans;

        
    }

    public void permCal(int index,int[] nums,List<List<Integer>> ans){

      
           
         if(index==nums.length){

            List<Integer> ds=new ArrayList<>();

            for(int i :nums){
                ds.add(i);
            }

            ans.add(new ArrayList<>(ds));
            return;
         }

         for(int i=index;i<nums.length;i++){

                  swap(nums,index,i);
                  permCal(index+1,nums,ans);
                  swap(nums,index,i);
         }


    }

    public void swap(int[] nums, int a, int b){

        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
