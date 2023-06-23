package day4;

import java.util.HashMap;
import java.util.Map;

class Election {
    private HashMap<String, Integer> candidates;

    public Election() {
        candidates = new HashMap<>();
    }

    public void vote(String name) {
        candidates.put(name, candidates.getOrDefault(name, 0) + 1);
    }

    public String winner() {
        String winnerName = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            String name = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes) {
                maxVotes = votes;
                winnerName = name;
            }
        }
        return winnerName + " - " + maxVotes;
    }
}