class Solution {
    public int[] sortedSquares(int[] nums) {
       int [] ans = new int[nums.length];
       int left =0;
       int right = nums.length-1;
       int index = nums.length-1;
       while(left<=right){
        int leftSeq = nums[left]*nums[left];
        int rightSeq = nums[right]*nums[right];
        if(leftSeq>rightSeq){
            ans[index]= leftSeq;
            left++;
        }
        else{
            ans[index]=rightSeq;
            right--;
        }
        index--;
       }
       return ans;
    }
}