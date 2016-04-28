public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        HashMap<String,List<Integer>> map=new HashMap<>();
        return helper(0,input.length()-1,input,map);
        
    }
    
    public List<Integer> helper(int i,int j,String input,HashMap<String,List<Integer>> map){
 		String key=getKey(i,j);
		List<Integer> value=new ArrayList<>();
		
		//memorization
		if(map.containsKey(key)){
			return map.get(key);
		}

        for(int k=i;k<j;k++){
            if(!Character.isDigit(input.charAt(k))){
                char oper=input.charAt(k);
                String left=getKey(i,k-1);
                String right=getKey(k+1,j);
                List<Integer> l=helper(i,k-1,input,map);
				List<Integer> r=helper(k+1,j,input,map);
                                
                for(Integer m:l){
                    for(Integer n:r){
                        if(oper=='+'){
                            value.add(m+n);
                        }else if(oper=='-'){
                            value.add(m-n);
                        }else if(oper=='*'){
                            value.add(m*n);
                        }else{
                            if(n!=0){
                                value.add(m/n);
                            }
                        }
                    }
                }
            }
        }
        //base case
        if(value.size()==0){
        	value.add(Integer.parseInt(input.substring(i,j+1)));
        }
        map.put(key,value);
        return value;
    }
    
    public String getKey(int i,int j){
        return Integer.toString(i)+Integer.toString(j);
    }
}
