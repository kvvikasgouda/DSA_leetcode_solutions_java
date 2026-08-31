class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        Set<Integer> b=new HashSet<>();
        for(int p:nums1){
            a.add(p);
        }
        for(int p:nums2){
            b.add(p);
        }
        int[] s=new int[b.size()];
        int k=0;
        for(int i:a){
            if(b.contains(i)){
                s[k]=i;
                k++;
            }
        }
        return Arrays.copyOfRange(s,0,k);
        
    }
}