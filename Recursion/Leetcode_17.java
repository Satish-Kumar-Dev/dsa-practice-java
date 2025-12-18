//Letter Combinations of a Phone Number
class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        return rec("",digits,map);
    }
    List<String> rec(String p, String up, Map<Character,String>map){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> list = new ArrayList<>();
        for(int i=0; i<map.get(ch).length();i++){
            char c = map.get(ch).charAt(i);
            list.addAll(rec(p+c, up.substring(1),map));
        }
        return list;
    }
}