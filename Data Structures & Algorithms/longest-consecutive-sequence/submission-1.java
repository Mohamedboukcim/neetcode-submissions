class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int x = 1;
        int result = 1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                x++;
            }
            else if (nums[i+1] == nums[i]){
                continue;
            }
            else if (nums[i+1] != nums[i]) {
                result = Math.max(result, x);
                x = 1;
            }

            System.out.println(result);
        }
        result = Math.max(result, x);

        return result;
    }
}
