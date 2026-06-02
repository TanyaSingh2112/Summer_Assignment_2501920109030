class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum =0;
        for(int i =0; i<k; i++){
            sum +=nums[i];
        }
        double max =sum;
        for(int j=k ; j<nums.length; j++){
            int sumNew = sum - nums[j-k]+nums[j];
           max = Math.max(max, sumNew);
           sum = sumNew;
        }
       double avg = max/k;
       return avg; 
    }
}