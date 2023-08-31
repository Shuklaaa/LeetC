class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1, slargest = -1, idx = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                slargest = largest;
                largest = nums[i];
                idx = i;
            }

            else if(nums[i] > slargest){
                slargest = nums[i];
            }
        }

        return (largest >= (2 * slargest)) ? idx : -1;
    }
}