class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> res = new ArrayList<Integer>();

        if(cheeseSlices * 2 > tomatoSlices){
            return res;
        }

        if(tomatoSlices % 2 != 0){
            return res;
        }

        int rem = tomatoSlices - cheeseSlices * 2;
        int jumbo = rem / 2;
        int small = cheeseSlices - jumbo;

        if(small < 0){
            return res;
        }

        res.add(jumbo);
        res.add(small);
        return res;
    }
}