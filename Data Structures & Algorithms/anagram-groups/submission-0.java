class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> > h1=new HashMap<>();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            if (!h1.containsKey(key)) {
                h1.put(key, new ArrayList<>());
            }
            h1.get(key).add(s);
        }
        return new ArrayList<>(h1.values());
    }
}
