class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        int[] freq = new int[26];

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = p.length();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char r = s.charAt(right);

            if (freq[r - 'a'] > 0) {
                count--;
            }

            freq[r - 'a']--;

            if (right - left + 1 > p.length()) {

                char l = s.charAt(left);

                if (freq[l - 'a'] >= 0) {
                    count++;
                }

                freq[l - 'a']++;
                left++;
            }

            if (count == 0) {
                ans.add(left);
            }
        }

        return ans;
    }
}