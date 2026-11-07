class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        
        HashMap<String, Integer> map = new HashMap<>();

        for (List<String> day : responses) {

            HashSet<String> set = new HashSet<>(day);

            for (String str : set) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        String ans = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            String word = entry.getKey();
            int freq = entry.getValue();

            if (freq > max || 
               (freq == max && word.compareTo(ans) < 0)) {

                max = freq;
                ans = word;
            }
        }

        return ans;
    }
}