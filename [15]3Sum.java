import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Solution{
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			if(i>0&&nums[i]==nums[i-1])continue;
			if(nums[i]+nums[i+1]+nums[i+2]>0)continue;
			if(nums[i]+nums[nums.length-1]+nums[nums.length-2]<0)continue;

			int m=i+1;
			int n=nums.length-1;
			while(m<n){
				int sum=nums[i]+nums[m]+nums[n];
				if(sum==0){
					res.add(Arrays.asList(nums[i], nums[m], nums[n]));
					while(m<n&&nums[m]==nums[m+1])m++;
					m++;
					while(m<n&&nums[n]==nums[n-1])n--;
					n--;
				}else if(sum<0){
					while(m<n&&nums[m]==nums[m+1])m++;
					m++;
				}else{
					while(m<n&&nums[n]==nums[n-1])n--;
					n--;
				}
			}
		}
		return res;
	}
}
