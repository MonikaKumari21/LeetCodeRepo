class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int closetSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==target){
                    return sum;
                } else if(Math.abs(target-sum)<Math.abs(target-closetSum)){
                    closetSum=sum;
                }
                if(sum<target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return closetSum;
        
    }

    
}
