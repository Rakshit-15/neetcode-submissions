class Solution {
    public List<List<Integer>> permute(int[] nums) {

       List<List<Integer>> ans = new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }

    void solve(int[] nums, int index, List<List<Integer>> ans){

        if(nums.length == index){
            List<Integer> ds = new ArrayList<>();
            for(int i : nums){
                ds.add(i);
            }
            ans.add(ds);
            return ;
        }

        for(int i=index ; i < nums.length ; i++){

            swap(index,i,nums);
            solve(nums,index+1,ans);
            swap(index,i,nums);

        }    
    }

    void swap(int i, int j, int[] nums){

         int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
    }
    
    }
