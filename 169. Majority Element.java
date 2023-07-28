class Solution {
    public int majorityElement(int[] nums) {
        int majIdx = 0, count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[majIdx] == nums[i]){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                majIdx = i;
                count = 1;
            }
        }
        return nums[majIdx];
    }
}