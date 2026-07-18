class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,ans,0,ds);
        return ans;
    }
    
    //     Set<List<Integer>> res = new HashSet<>();
    //     List<Integer> ds = new ArrayList<>();
    //     Arrays.sort(nums);
    //     solve(nums,res,0,ds);
    //      return new ArrayList<>(res);
        
    // }
    //Brute force


    // void solve(int[] nums, Set<List<Integer>> ans,int index,List<Integer> ds){

    //     if(index >= nums.length){
            
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //}

    //     ds.add(nums[index]);//pick
    //     solve(nums,ans,index+1,ds);
    //     ds.remove(ds.size()-1);
    //     solve(nums,ans,index+1,ds);//not pick

    //}

    void solve(int[] nums,List<List<Integer>> ans,int index,List<Integer> ds){

                ans.add(new ArrayList<>(ds));  

                for(int i=index ; i < nums.length;i++){

                    if(i>index && nums[i]==nums[i-1]) continue;
                    ds.add(nums[i]);
                    solve(nums,ans,i+1,ds);
                    ds.remove(ds.size()-1);
                }             
    }
}

