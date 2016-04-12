public class Solution{
	public int[] plusOne(int[] digits){
		int carry=1;
		for(int i=digits.length-1;i>=0;i--){
			int tmp=digits[i];
			digits[i]=(digits[i]+carry)%10;
			carry=(tmp+carry)/10;
			if(carry==0){
				return digits;
			}
		}

		int[] res=new int[digits.length+1];
		res[0]=1;
		for(int i=0;i<digits.length;i++){
			res[i+1]=digits[i];
		}
		return res;
	}
}
