class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                c = (char) ((int) c + 32);
            }
            res.append(c);
        }
        return res.toString();
    }
}