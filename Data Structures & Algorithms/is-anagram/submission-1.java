class Solution {
    public boolean isAnagram(String s, String t) {
               char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();


        if(sTemp.length != tTemp.length) {
            System.out.println("Lengths do not match");
            return false;
        }

        HashMap<Character, Integer> set = new HashMap<>();
        HashMap<Character, Integer> set2 = new HashMap<>();

        for (char c : sTemp) {
            set.put(c, set.getOrDefault(c, 0) + 1);
        }
        for (char c : tTemp) {
            set2.put(c, set2.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> c : set.entrySet()) {

           Character key = c.getKey();

            if(!c.getValue().equals(set2.getOrDefault(key, 0))) {
                System.out.println("Duplicates do not match");
                return false;
            }
        }

         return true;

    }
}
