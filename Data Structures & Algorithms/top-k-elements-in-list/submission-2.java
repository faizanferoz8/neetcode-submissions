class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];

        for(int num : nums){
           map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0 ; i < k ; i++) {
            int maxValue = Collections.max(map.values());
            int key = map.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), maxValue))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null); 
            result[i] = key;
            map.remove(key);    
        }

        return result;

    }
}

