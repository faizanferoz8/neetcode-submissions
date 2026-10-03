class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for(int num : nums){
            if(set.contains(num)){
                hasDuplicate = true;
            } else{
                 set.add(num);
            }
        }

        return hasDuplicate;
    }
}