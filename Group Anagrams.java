class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>(); // creating a return value
        HashMap<String, List<String>> map = new HashMap<>();    //this sorted word maps to these anagrams
        for(String current: strs) {                            
            char[] characters = current.toCharArray();          //to sort characters of the current word
            Arrays.sort(characters);                            //this is sorting the above
            String sorted = new String(characters);             //this converts the above charcters back to string after being sorted
            if(!map.contains(sorted)) {                         //to check the map if they have the sorted characetrs
                map.put(sorted, new ArrayList<>());             //put the sorted word in the map
            }

            map.get(sorted).add(current);                       //adding current word to sorted list
        }

        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}