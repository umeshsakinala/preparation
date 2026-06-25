class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li = new ArrayList<>();
        int flag[] = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            if(flag[i] == 1) {
                continue;
            }
            String a = strs[i];
            flag[i] = 1;
            List<String> l = new ArrayList<String>();
            l.add(a);
            char[] atemp = a.toCharArray();
            Arrays.sort(atemp);
            a = new String(atemp);
            for(int j=i+1; j<strs.length; j++) {
                if(flag[j] == 0) {
                    String b = strs[j];
                    boolean isValid = false;
                    char[] btemp = b.toCharArray();
                    Arrays.sort(btemp);
                    String bstring = new String(btemp);
                    if(a.equals(bstring)) {
                        isValid = true;
                    }
                    if(isValid == true) {
                        flag[j] = 1;
                        l.add(b);
                    }
                }
            }
            li.add(new ArrayList<>(l));
        }
        return li;
    }
}
