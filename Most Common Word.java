class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {     
           
        HashSet<String> bannedWords = new HashSet<>();
        for(String word : banned) {
            bannedWords.add(word);
        }
        
        HashMap<String, Integer> counts = new HashMap<>();
        for(String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
            if(!bannedWords.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        
        String result = "";
        for(String key:counts.keySet()) {
            if(result.equals("") || counts.get(key) > counts.get(result)) {
                result = key;
            }
        }
        
        return result;
    }
}

// we want to create a hashmap and throw all off them in there 
// then we ignore all sorts of punctuations and uppercase and lowercase letters. 
// Finally we iterate through the string and keep a variable that would be update 