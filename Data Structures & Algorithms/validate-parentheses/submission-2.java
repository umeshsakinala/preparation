class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) {
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            }
            else {
                if(s.charAt(i) == ')') {
                    if(st.isEmpty() == false && st.peek() == '(') {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
                else if(s.charAt(i) == ']') {
                    if(st.isEmpty() == false && st.peek() == '[') {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
                else if(s.charAt(i) == '}') {
                    if(st.isEmpty() == false && st.peek() == '{') {
                        st.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return st.size() == 0;
    }
}
