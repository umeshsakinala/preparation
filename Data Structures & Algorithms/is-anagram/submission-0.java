class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 1)+1);
        }
        for(int i=0; i<t.length(); i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 1)-1);
        }
        for(Map.Entry<Character, Integer> i: mp.entrySet()) {
            if(i.getValue() != 1) {
                return false;
            }
        }
        return true;
    }
}
