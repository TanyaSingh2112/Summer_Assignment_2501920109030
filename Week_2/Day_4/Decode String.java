class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
         String currString = "";
         int num =0;
         for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 +(ch -'0');
            }
            else if(ch =='['){
                countStack.push(num);
                stringStack.push(currString);
                num =0;
                currString ="";
            }
            else if(ch ==']'){
                int repeat = countStack.pop();
                String previous = stringStack.pop();
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<repeat; i++){
                   sb.append(currString);
                }
                currString = previous + sb.toString();
            }
            else{
                currString +=ch;
            }
         }
         return currString;
    }
}