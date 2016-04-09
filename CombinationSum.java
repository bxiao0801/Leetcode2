//unlike combSum2, we're never running out of candidates, so we only care about the situation when we can stop early
public class Solution{
	public List<List<Integer>> combinationSum(int[] candidates,int target){
		List<List<Integer>> res=new ArrayList<>();
		Arrays.sort(candidates);
		helper(candidates,0,target,new ArrayList<Integer>(),res);
		return res;
	}

	public void helper(int[] candidates,int index,int target,List<Integer> tmp, List<List<Integer>> res){
		if(target<0){
			return;
		}
		if(target==0){
			res.add(new ArrayList<Integer>(tmp));
			return;
		}
		for(int i=index;i<candidates.length;i++){
			tmp.add(candidates[i]);
			helper(candidates,i,target-candidates[i],tmp,res);
			tmp.remove(tmp.size()-1);
		}
	}
}
