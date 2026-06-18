class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        solve(ans,ds,target,nums,0);
        return ans;
        
    }

    public void solve(List<List<Integer>> ans , List<Integer> ds , int target , int[] nums,int index){

           if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
           }
           for(int i =index ;i<nums.length;i++){

             if (nums[i] <= target) {
                ds.add(nums[i]);
             
              solve(ans,ds,target-nums[i],nums,i);          
            ds.remove(ds.size()-1);
           }
           }

    }
}
