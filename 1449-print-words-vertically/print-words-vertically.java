class Solution {
    public List<String> printVertically(String s) {
        List<List<Character>> mt = new ArrayList<>();
        String[] m = s.split(" ");
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            List<Character> row = new ArrayList<>();

            for (char ch : m[i].toCharArray()) {
                row.add(ch);
            }
            mt.add(row);
             max = Math.max(max, row.size());
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < mt.size(); j++) {
                if (i < mt.get(j).size()) {
                    sb.append(mt.get(j).get(i));
                } else {
                    sb.append(' ');
                }
            }
            while (sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(sb.length() - 1);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}