class Solution {
    public void re(int[] nums,int st,int end){
        while(st<=end){
            int t=nums[st];
            nums[st]=nums[end];
            nums[end]=t;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       
        int n=nums.length;
        if(k%n==0){
            return;
        }
        k=k%n;
        re(nums,0,nums.length-1);
        re(nums,0,k-1);
        re(nums,k,nums.length-1);
        
    }
}