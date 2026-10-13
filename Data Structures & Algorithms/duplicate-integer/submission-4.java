class Solution {
    // public boolean hasDuplicate(int[] nums) {
    //          Set<Integer> set = new HashSet<>();

    //     for(int i : nums){
    //         set.add(i);
    //     }
    //     if(set.size() == nums.length) return false;
    //     return true;
    // }
public boolean hasDuplicate(int[] nums) {
     Set<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (!set.add(num)) {
            return true;
        }
    }

    return false;
    }
}
