public class Solution{
	public int maxArea(int[] height){
		int maxArea=0;
		int i=0;
		int j=height.length-1;
		while(i<j){
			int h_i=height[i];
			int h_j=height[j];
			maxArea=Math.max(maxArea,Math.min(h_i,h_j)*(j-i));
			if(h_i<h_j){
				while(i<j&&height[i]<=h_i){
					i++;
				}
			}else{
				while(j>i&&height[j]<=h_j){
					j--;
				}
			}	
		}
		return maxArea;
	}
}
