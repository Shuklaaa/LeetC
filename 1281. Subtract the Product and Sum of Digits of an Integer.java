class Solution {
    public int subtractProductAndSum(int n) {
        int pro = findPro(n);
        int sum = findSum(n);

        return pro - sum;
    }

    public int findPro(int n){
        int product = 1;
        while(n > 0){
            int rem = n % 10;
            product *= rem;

            n /= 10;
        }
        return product;
    }

    public int findSum(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;

            n /= 10;
        }
        return sum;
    }
}