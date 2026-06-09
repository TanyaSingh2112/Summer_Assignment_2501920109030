class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> set = new HashSet<>();
      int low =0;
       int maxLength=0;
      for( int high =0; high<s.length(); high++){
      while(set.contains(s.charAt(high))){
        set.remove(s.charAt(low));
        low++;
      }
      set.add(s.charAt(high));
      maxLength = Math.max(maxLength, high-low+1);
    }
    return maxLength;
    }
}