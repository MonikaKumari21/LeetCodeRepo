class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumRem = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(sumRem.containsKey(target-nums[i])){
                return new int[]{sumRem.get(target-nums[i]),i};

            } else{
                sumRem.put(nums[i],i);
            }
        }
        return new int[0];
        
    }
}
