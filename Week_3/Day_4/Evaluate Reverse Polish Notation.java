class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
       for(String token: tokens){
        if(token.equals("+") ||token.equals("-") || token.equals("*") ||token.equals("/")){
            int b = s.pop();
            int a = s.pop();
            int res=0;
            if(token.equals("+"))
            res = a+b;
            else if(token.equals("-"))
             res = a-b;
             else if(token.equals("*"))
              res = a*b;
             else if(token.equals("/"))
              res = a/b;
              s.push(res);
        }else{
            s.push(Integer.parseInt(token));
        }
       }
       return s.pop();
    }
    
}