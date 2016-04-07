import java.util.Arrays;
public class Solution{
	public int threeSumSmaller(int[] nums,int target){
		int count=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(nums[i]+nums[i+1]+nums[i+2]>=target)continue;
			if(nums[i]+nums[nums.length-2]+nums[nums.length-1]<target){
				count+=(nums.length-i-1)*(nums.length-i-2)/2;
				continue;
			}

			int m=i+1;
			int n=nums.length-1;
			while(m<n){
				if(nums[i]+nums[m]+nums[n]<target){
					count+=n-m;
					m++;
				}else{
					n--;
				}
			}
		}
		return count;
	}
}
