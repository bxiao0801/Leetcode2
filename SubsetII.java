import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution{
	public List<List<Integer>> subsetsWithDup(int[] nums){
		List<List<Integer>> res=new ArrayList<>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(nums);
		helper(0,nums,new ArrayList<Integer>(),res);
		return res;
	}

	public void helper(int index,int[] nums,ArrayList<Integer> tmp,List<List<Integer>> res){
		if(index==nums.length){
			return;
		}
		for(int i=index;i<nums.length;i++){
			if(i>index&&nums[i]==nums[i-1]){
				continue;
			}
			tmp.add(nums[i]);
			res.add(new ArrayList<>(tmp));
			helper(i+1,nums,tmp,res);
			tmp.remove(tmp.size()-1);
		}
	}
}
