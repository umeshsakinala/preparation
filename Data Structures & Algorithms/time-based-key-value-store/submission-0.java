class TimeMap {
    HashMap<String, TreeMap<Integer, String>> mp;
    public TimeMap() {
        this.mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        mp.computeIfAbsent(key, k-> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(mp.containsKey(key) == false) {
            return "";
        }
        TreeMap<Integer, String> timestamps = mp.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}
