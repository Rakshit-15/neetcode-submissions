class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,res,0,ds);
         return new ArrayList<>(res);
        
    }
    void solve(int[] nums, Set<List<Integer>> ans,int index,List<Integer> ds){

        if(index >= nums.length){
            
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);//pick
        solve(nums,ans,index+1,ds);
        ds.remove(ds.size()-1);
        solve(nums,ans,index+1,ds);//not pick

    }


}
