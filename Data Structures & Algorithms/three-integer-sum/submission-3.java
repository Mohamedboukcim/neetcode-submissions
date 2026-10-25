class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = 1;
        int r = nums.length-1;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            l = i+1;
            r = nums.length-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(l==i || r==i) continue;
                if(sum > 0) {r--;}
                else if (sum < 0) {l++;}
                else{
                    result.add(new ArrayList<>(List.of(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
            }
        }
        return result;
    }
}
