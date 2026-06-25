class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String s: strs) {
            char chars[] = s.toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            if(mp.containsKey(temp)) {
                mp.get(temp).add(s);
            }
            else {
                List<String> li = new ArrayList<String>();
                li.add(s);
                mp.put(temp, li);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
