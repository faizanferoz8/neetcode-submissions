class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] arr = new int[26];
            char[] characters = str.toCharArray();

            for(char character : characters){
               arr[character - 'a']++;
            }
            
            String key = Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
