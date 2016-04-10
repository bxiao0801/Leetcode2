public class Solution{
	public List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> res=new ArrayList<>();
		HashMap<String,List<String>> map=new HashMap<>();
		for(String s:strs){
			String tmp=new String(s);
			char[] sortedTmp=tmp.toCharArray();
			Arrays.sort(sortedTmp);
			String key=new String(sortedTmp);
			if(map.containsKey(key)){
				List<String> l=map.get(key);
				l.add(s);
				map.put(key,l);
			}else{
				List<String> l=new ArrayList<>();
				l.add(s);
				map.put(key,l);
			}
		}
		for(String key:map.keySet()){
			Collections.sort(map.get(key));
			res.add(map.get(key));
		}
		return res;
	}
}
