class Solution {
    Map<Character, Integer> freqMap = new HashMap<>();
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        addToMap(s);

        System.out.println(freqMap);

        for(char t1 : t.toCharArray()){
            if(freqMap.containsKey(t1)){
                int value = freqMap.get(t1);
                if(--value > 0) freqMap.put(t1, value);
                else freqMap.remove(t1);
            }
        }

     return (freqMap.size() == 0);

    }

    private void addToMap(String s1){
        for(char c : s1.toCharArray()){
            freqMap.merge(c, 1, Integer::sum);
        }
    }
}
