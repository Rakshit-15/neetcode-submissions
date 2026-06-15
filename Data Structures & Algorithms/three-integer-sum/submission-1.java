class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
         int i=0,j;
//    List<Integer> ds=new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(arr); // Arrays.sort doesn't return anything but sorts the existing array itself.
   // System.out.println(Arrays.toString(arr));
    while(i < arr.length-2){

        if (i > 0 && arr[i] == arr[i - 1]) {
            i++;
            continue;
        }
        j=i+1;
        int k=arr.length-1;
        while(j<k){
            if(arr[j]+arr[k] == -arr[i]){
//                List<Integer> ds=new ArrayList<>();
//                ds.add(arr[i]);
//                ds.add(arr[j++]);
//                ds.add(arr[k--]);
//                ans.add(ds);
                ans.add(Arrays.asList(arr[i],arr[j++],arr[k--]));

                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }

                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
            }
            else if(arr[j]+arr[k] < -arr[i]){
                j++;
            }
            else{
                k--;
            }
        }
        i++;
    }
    return ans;
}
    }

