import java.util.Arrays;
public class Solution{
	public int threeSumClosest(int[] nums,int target){
		//be careful, I was setting closest=Integer.MAX_VALUE, then when target<0 the difference overflows and I got it wrong.
		int closest=nums[0]+nums[1]+nums[2];
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			if(i>0&&nums[i]==nums[i-1]){
				continue;
			}

			int m=i+1;
			int n=nums.length-1;
			while(m<n){
				int sum=nums[m]+nums[n]+nums[i];
				if(sum==target){
					return target;
				}else if(sum<target){
					if(Math.abs(sum-target)<Math.abs(closest-target)){
						closest=sum;
					}
					while(m<n&&nums[m]==nums[m+1]){
						m++;
					}
					m++;
				}else{
					if(Math.abs(sum-target)<Math.abs(closest-target)){
						closest=sum;
					}
					while(m<n&&nums[n]==nums[n-1]){
						n--;
					}
					n--;
				}
			}
		}
		return closest;
	}
}
