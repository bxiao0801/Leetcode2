public class Solution{
	public List<List<Integer>> combinationSum2(int[] candidates,int target){
		List<List<Integer>> res=new ArrayList<>();
		Arrays.sort(candidates);
		helper(0,target,new ArrayList<Integer>(),candidates,res);
		return res;
	}

	public void helper(int index,int target,ArrayList<Integer> tmp,int[] candidates,List<List<Integer>> res){
		if(target==0){
			res.add(new ArrayList<Integer>(tmp));
			return;
		}
    //we're summing up to beyond target, no need to preceed so we stop early;or we're running out of available candidates but still didn't
    //get to target, so we backtrack.
		if(target<0||index==candidates.length){
			return;
		}

        for(int i=index;i<candidates.length;i++){
			if(i>index&&candidates[i]==candidates[i-1])continue;

			tmp.add(candidates[i]);
			helper(i+1,target-candidates[i],tmp,candidates,res);
			tmp.remove(tmp.size()-1);
		}
	}
}
