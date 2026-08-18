class Solution {
    Map<String, Integer> mp = new HashMap<>();

    void dfs(String endWord, String beginWord,
             List<List<String>> vec, List<String> vs) {

        if (endWord.equals(beginWord)) {
            Collections.reverse(vs);
            vec.add(new ArrayList<>(vs));
            Collections.reverse(vs);
            return;
        }

        for (int j = 0; j < endWord.length(); j++) {
            String ss = endWord;

            for (char c = 'a'; c <= 'z'; c++) {
                StringBuilder sb = new StringBuilder(ss);
                sb.setCharAt(j, c);
                String next = sb.toString();

                if (mp.containsKey(next)
                        && mp.get(next) + 1 == mp.get(endWord)) {

                    vs.add(next);
                    dfs(next, beginWord, vec, vs);
                    vs.remove(vs.size() - 1);
                }
            }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Queue<String> q = new LinkedList<>();
        Set<String> s = new HashSet<>();

        for (String word : wordList) {
            s.add(word);
        }

        s.remove(beginWord);
        q.offer(beginWord);

        int h = 0;

        while (!q.isEmpty()) {
            int l = q.size();
            h++;

            while (l-- > 0) {
                String word = q.poll();
                mp.put(word, h);

                for (int j = 0; j < word.length(); j++) {
                    StringBuilder sb = new StringBuilder(word);

                    for (char c = 'a'; c <= 'z'; c++) {
                        sb.setCharAt(j, c);
                        String next = sb.toString();

                        if (s.contains(next)) {
                            q.offer(next);
                            s.remove(next);
                        }
                    }
                }
            }
        }

        List<List<String>> vec = new ArrayList<>();

        if (mp.containsKey(endWord)) {
            List<String> vs = new ArrayList<>();
            vs.add(endWord);

            dfs(endWord, beginWord, vec, vs);
        }

        return vec;
    }
}