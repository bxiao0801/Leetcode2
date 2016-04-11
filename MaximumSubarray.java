public class Solution{
	public int maxSubArray(int[] nums){
		int max=nums[0];
		int maxEndingHere=nums[0];
		for(int i=1;i<nums.length;i++){
			maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
			max=Math.max(max,maxEndingHere);
		}
		return max;
	}

	public static void main(String[] args){
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		Solution s=new Solution();
		System.out.println(s.maxSubArray(nums));
	}
}
