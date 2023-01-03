class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int count = 0;
        for(int i=0;i<n;i++){
            char a = 'a';
            for(int j=0;j<strs.length;j++){
                char t = strs[j].charAt(i);
                if(t < a){
                    count++;
                    break;
                }else{
                    a = t;
                }
            }
        }
        return count;
    }
}
