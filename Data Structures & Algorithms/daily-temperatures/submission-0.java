class Pair {
    int temperature;
    int index;
    Pair(int temperature, int index) {
        this.temperature = temperature;
        this.index = index;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st = new Stack<Pair>();
        int result[] = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++) {
            int temperature = temperatures[i];
            while(!st.isEmpty() && temperature > st.peek().temperature) {
                Pair p = st.pop();
                result[p.index] = i - p.index;
            }
            st.push(new Pair(temperature, i));
        }
        return result;
    }
}
