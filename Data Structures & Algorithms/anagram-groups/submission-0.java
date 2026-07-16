class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>>Map = new HashMap<>();
        for(String word : strs){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            if(!Map.containsKey(key)){
              Map.put(key,new ArrayList<>());   
            }
            Map.get(key).add(word);
        }
        return new ArrayList<>(Map.values());

    }
}