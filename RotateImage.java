/**
*flip it upside down,then flip swap the it around the diagonal line
public class Solution{
	public void rotate(int[][] matrix){
		int len=matrix.length;
		for(int i=0;i<len/2;i++){
			for(int j=0;j<len;j++){
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[len-i-1][j];
				matrix[len-i-1][j]=tmp;
			}
		}

		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				int tmp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=tmp;
			}
		}
	}
}
