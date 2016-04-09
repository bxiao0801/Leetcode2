public class Solution{
	public boolean isValidSudoku(char[][] board){
		//check row
		for(int i=0;i<9;i++){
			HashSet<Character> set=new HashSet<Character>();
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					if(set.contains(board[i][j])){
						return false;
					}
					set.add(board[i][j]);
				}
			}
		}

		//check col
		for(int i=0;i<9;i++){
			HashSet<Character> set=new HashSet<Character>();
			for(int j=0;j<9;j++){
				if(board[j][i]!='.'){
					if(set.contains(board[j][i])){
						return false;
					}
					set.add(board[j][i]);
				}
			}
		}

		//check 9 squares
		for(int i=0;i<9;i++){
			HashSet<Character> set=new HashSet<Character>();
			for(int j=i/3*3;j<i/3*3+3;j++){
				for(int k=i%3*3;k<i%3*3+3;k++){
					if(board[j][k]!='.'){
						if(set.contains(board[j][k])){
							return false;
						}
						set.add(board[j][k]);
					}
				}
			}
		}
		return true;
	}
}
