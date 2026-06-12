class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read =0;
        int write =0;
        while(read<n){
            int count =1;
            while(read+1 < n && chars[read] == chars[read+1]){
                count++;
                read++;
            }
            chars[write] = chars[read];
            write++;
            if(count>1){
                String str = String.valueOf(count);
                for(char ch : str.toCharArray()){
                    chars[write] = ch;
                    write++;
                }
            }
                read++;
        }
        return write;
    }
}