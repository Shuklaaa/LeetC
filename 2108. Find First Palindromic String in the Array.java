class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(pali(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public boolean pali(String s){
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}