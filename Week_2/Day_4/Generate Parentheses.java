class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        parentheses(0, 0, "",result, n);
        return result;
    }
    void parentheses(int open , int close,String current, List<String> result, int n){
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        if(open<n){
            parentheses(open+1, close, current +"(",result, n);
        }
        if(close<open){
            parentheses(open, close+1, current+")",  result, n);
        }
        }
    }