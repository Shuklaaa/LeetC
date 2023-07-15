class Solution {
    public int sumOfMultiples(int n) {
        int count=0;

        for(int i=1; i<=n; i++){
            if(i%7==0){
                count+=i;
            }
            else if(i%5==0){
                count+=i;
            }
            else if(i%3==0){
                count+=i;
            }

        }
        return count;
    }
}


// USING ARRAY LIST

class Solution {
    public int sumOfMultiples(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0 || i % 6 == 0 || i % 7 == 0){
                list.add(i);
            }
        }

        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }

        return ans;
    }
}