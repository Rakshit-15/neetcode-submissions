class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> ds=new ArrayList<>();

    combSum(0,nums,target,ds,ans);
    return ans;
        
    }

    public void combSum(int index,int[] nums,int target,List<Integer> ds,List<List<Integer>> ans){

                if(index==nums.length){
             if(target==0){

                ans.add(new ArrayList<>(ds));
            
             }
                   return;
             
                }
  
                   if(nums[index]<=target){
                    ds.add(nums[index]);
                    combSum(index,nums,target-nums[index],ds,ans);
                    ds.remove(ds.size()-1);
                   }
                    combSum(index+1,nums,target,ds,ans);
    
            
}
}
