class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int n = words.length;
        for(int i=0; i<n; i++){
            if(isContains(words[i],x))
                list.add(i);
        }
        return list;
    }
    boolean isContains(String s,char target){
        if(s.length()==0) return false;
        if(s.charAt(0)==target) return true;
        return isContains(s.substring(1),target);
    }
}