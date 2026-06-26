class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++) {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                int number = Integer.valueOf(tokens[i]);
                st.push(number);
            }
            else {
                String operation = tokens[i];
                int a = st.pop();
                int b = st.pop();
                if(operation.equals("+")) {
                    a = a+b;
                }
                else if(operation.equals("-")) {
                    a = b-a;
                }
                else if(operation.equals("*")) {
                    a = a*b;
                }
                else if(operation.equals("/")) {
                    a = b/a;
                }
                st.push(a);
            }
        }
        return st.pop();
    }
}
