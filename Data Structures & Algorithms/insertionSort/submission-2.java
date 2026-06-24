// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        if(pairs.size() == 0) {
            return new ArrayList<>();
        }
        List<List<Pair>> li = new ArrayList<>();
        li.add(new ArrayList<Pair>(pairs));
        if(pairs.size() == 1) {
            return li;
        }
        for(int i=1; i<pairs.size(); i++) {
            int j = i-1;
            Pair a = pairs.get(i);
            while(j >= 0 && a.key < pairs.get(j).key) {
                pairs.set(j+1, pairs.get(j));
                j--;
            }
            pairs.set(j+1, a);
            li.add(new ArrayList<Pair>(pairs));
        }
        return li;
    }
}
