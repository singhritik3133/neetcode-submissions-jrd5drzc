class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> h1=new HashMap<>();
        for(char i:s.toCharArray() ){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }else{
                h1.put(i,1);
            }
        }
        for(char j:t.toCharArray()){
            if(h1.containsKey(j)){
                h1.put(j,h1.get(j)-1);
            }else{
                return false;
            }

        }
        for(int i:h1.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
