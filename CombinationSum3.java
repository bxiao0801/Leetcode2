import java.util.List;
import java.util.ArrayList;

public class Solution{
	public List<List<Integer>> combinationSum3(int k,int n){
		List<List<Integer>> res=new ArrayList<List<Integer>>();

		helper(1,k,n,new ArrayList<Integer>(),res);
		return res;
	}

	public void helper(int index,int k,int n,ArrayList<Integer> tmp,List<List<Integer>> res){
		if(k==0&&n==0){
			res.add(new ArrayList<Integer>(tmp));
			return;
		}
		if(index>n){
			return;
		}
		if(k>0&&n<=0){
			return;
		}

		for(int i=index;i<=9;i++){
			tmp.add(i);
			helper(i+1,k-1,n-i,tmp,res);
			tmp.remove(tmp.size()-1);
		}
	}
}
