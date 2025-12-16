
// Leetcode 821: Shortest Distance to a Character
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(s.charAt(i)==c)
                list.add(i);
        }
        int []ans = new int[n];
        for(int i = 0; i < n; i++){
            int minDist = n;
            for(int num: list){
                int dist = Math.abs(i - num);
                if(dist < minDist) minDist = dist;
            }
            ans[i] = minDist;
        }
        return ans;
    }
}