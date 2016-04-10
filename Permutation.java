public class Solution{
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res=new ArrayList<>();
		boolean[] used=new boolean[nums.length];
		helper(nums,used,new ArrayList<Integer>(),res);
		return res;
	}

	public void helper(int[] nums,boolean[] used,ArrayList<Integer> tmp,List<List<Integer>> res){
		if(tmp.size()==nums.length){
			res.add(new ArrayList<>(tmp));
			return;
		}
		for(int i=0;i<nums.length;i++){
			if(used[i]==false){
				used[i]=true;
				tmp.add(nums[i]);
				helper(nums,used,tmp,res);
				tmp.remove(tmp.size()-1);
				used[i]=false;
			}
		}
	}
}
