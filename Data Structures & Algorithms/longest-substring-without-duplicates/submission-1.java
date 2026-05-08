class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> char_set=new HashSet<>();
        int left=0;
        int result=0;
        for(int right=0;right<s.length();right++){
            while(char_set.contains(s.charAt(right))){
                char_set.remove(s.charAt(left));
                left++;
            }
            char_set.add(s.charAt(right));
            result=Math.max(right-left+1,result); 
        }
        return result;
    }
}
