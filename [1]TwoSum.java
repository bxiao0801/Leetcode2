/**
 * Input contains dulicates,and output has multiple pairs
 *
**/
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Solution{
	public List<int[]> twoSum(int[] nums,int target){
		List<int[]> res=new ArrayList<>();
		HashMap<Integer,List<Integer>> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				List<Integer> tmp=map.get(nums[i]);
				tmp.add(i);
				map.put(nums[i],tmp);
			}else{
				List<Integer> tmp=new ArrayList<>();
				tmp.add(i);
				map.put(nums[i],tmp);
			}
		}
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]*2==target&&map.get(nums[i]).size()>=2&&count==0){
				List<Integer> tmp=map.get(nums[i]);
				int len=tmp.size();
				for(int m=0;m<len-1;m++){
					for(int n=m+1;n<len;n++){
						res.add(new int[]{tmp.get(m),tmp.get(n)});
					}
				}

				count++;
			}else if(nums[i]*2<target){
				if(map.containsKey(target-nums[i])){
					List<Integer> tmp=map.get(target-nums[i]);
					for(int j=0;j<tmp.size();j++){
						res.add(new int[]{i,tmp.get(j)});
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums={3,3,3,2,4,4,1,1,5};
		Solution s=new Solution();
		List<int[]> res=s.twoSum(nums,6);
		for(int[] arr:res){
			System.out.println(Integer.toString(arr[0])+","+Integer.toString(arr[1]));
		}
	}
}
