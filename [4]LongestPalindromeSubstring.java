public class Solution{
	private int low;
	private int high;
	public String longestPalindrome(String s){
		if(s==null||s.length()==0){
			return s;
		}

		for(int i=0;i<s.length();i++){
			findLongest(s,i,i);
			findLongest(s,i,i+1);
		}
		return s.substring(low,high+1);
	}

	public void findLongest(String s,int i,int j){
		while(i>-1&&j<s.length()&&s.charAt(i)==s.charAt(j)){
			i--;
			j++;
		}
		if(j-i-1>high-low){
			low=i+1;
			high=j-1;
		}

	}
}
