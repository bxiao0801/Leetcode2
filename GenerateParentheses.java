public class Solution{
	public List<String> generateParenthesis(int n){
		List<String> res=new ArrayList<>();
		helper(n,0,0,res,"");
		return res;
	}

	public void helper(int n,int left,int right,List<String> res,String tmp){
		if(left==n&&left==right){
			res.add(tmp);
			return;
		}
		if(left==n&&left>right){
			helper(n,left,right+1,res,tmp+')');
		}
		if(left<n){
			if(left>right){
				helper(n,left+1,right,res,tmp+'(');
				helper(n,left,right+1,res,tmp+')');
			}else{
				helper(n,left+1,right,res,tmp+'(');
			}
		}
	}
}
