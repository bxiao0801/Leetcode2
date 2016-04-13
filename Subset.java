import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Solution{
	public List<List<Integer>> subset(int[] nums){
		List<List<Integer>> res=new ArrayList<>();
		res.add(new ArrayList<Integer>());
		Arrays.sort(nums);
		helper(nums,0,new ArrayList<Integer>(),res);
		return res;
	}

	public void helper(int[] nums,int index,List<Integer> tmp,List<List<Integer>> res){
		if(index==nums.length){
			return;
		}

		for(int i=index;i<nums.length;i++){
			tmp.add(nums[i]);
			res.add(new ArrayList<>(tmp));
			helper(nums,i+1,tmp,res);
			tmp.remove(tmp.size()-1);
		}
	}
}
