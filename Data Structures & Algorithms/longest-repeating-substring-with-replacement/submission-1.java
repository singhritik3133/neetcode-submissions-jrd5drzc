class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int max_len=0;
        int max_freq=0;
        
        Map<Character,Integer>char_map=new HashMap<>();

        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            char_map.put(ch, char_map.getOrDefault(ch, 0) + 1);

            max_freq=Math.max(max_freq,char_map.get(ch));

            if((right-left+1)-max_freq>k){
                char leftChar = s.charAt(left);
                char_map.put(leftChar, char_map.get(leftChar) - 1);
                left++;
            }
            max_len=Math.max(max_len,right-left+1);

        }
        return max_len;

        
    }
}
