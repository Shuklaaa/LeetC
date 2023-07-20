class Solution {
    public int passThePillow(int n, int time) {
        int holder = 1;
        boolean forward = true;
        for (int t = 0; t < time; t++) {
            if (holder == 1) {
                forward = true;
            } else if (holder == n) {
                forward = false;
            }

            if (forward) {
                holder++;
            } else {
                holder--;
            }
        }
        return holder;
    }
}