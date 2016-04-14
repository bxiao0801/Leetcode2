public class Solution{
	public boolean isValidBST(TreeNode root){
		Stack<TreeNode> stack=new Stack<TreeNode>();
		TreeNode curr=root;
		TreeNode pre=null;
		while(curr!=null||!stack.empty()){
			if(curr!=null){
				while(curr!=null){
					stack.push(curr);
					curr=curr.left;
				}
			}else{
				curr=stack.pop();
				if(pre!=null&&curr.val<=pre.val){
					return false;
				}
				pre=curr;
				curr=curr.right;
			}
		}
		return true;
	}
}
