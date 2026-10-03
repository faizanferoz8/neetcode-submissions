class Solution {
    public boolean isAnagram(String s, String t) {
           
      HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
      HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();

      if(s.length() != t.length()){
        return false;
      }

      for(char c : s.toCharArray()){
             sMap.put(c,sMap.getOrDefault(c, 0) + 1);
      }
      for(char c : t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c, 0) + 1);
      }

     return sMap.equals(tMap);

    }
}
