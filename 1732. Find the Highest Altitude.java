class Solution {
    public int largestAltitude(int[] gain) {
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i] + gain[i - 1];
        }

        for(int i = 0 ; i < gain.length; i++){
            if(gain[i] > ans){
                ans = gain[i];
            }
        }
        if(ans <= 0){
            return 0;
        }
        return ans;
    }
}