class Solution {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    public boolean hasDuplicate(int[] nums) {
       
       for(int num : nums){
        if(frequencyMap.containsKey(num)) return true;
        frequencyMap.put(num, 1);
       }
    return false;
    }
}