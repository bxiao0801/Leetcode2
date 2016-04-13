public class Solution{
	public boolean searchMatrix(int[][] matrix,int target){
		int row=searchRow(matrix,0,matrix.length-1,target);
		if(row==-1){
			if(target<matrix[0][0]){
				return false;
			}
			row=0;
		}
		return searchCol(matrix[row],0,matrix[0].length-1,target);
	}

	//return the row num to be searched
	public int searchRow(int[][] matrix,int i,int j,int target){
		while(i<=j){
			int mid=(i+j)/2;
			if(matrix[mid][0]==target){
				return mid;
			}else if(matrix[mid][0]<target){
				i=mid+1;
			}else{
				j=mid-1;
			}
		}
		return j;
	}

	public boolean searchCol(int[] row,int i,int j,int target){
		while(i<=j){
			int mid=(i+j)/2;
			if(row[mid]==target){
				return true;
			}else if(row[mid]<target){
				i=mid+1;
			}else{
				j=mid-1;
			}
		}
		return false;
	}
}
