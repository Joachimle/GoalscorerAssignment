import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<MatchResult> matchResults;

    public Statistics(String filename) throws FileNotFoundException {
        matchResults = new MatchResultFileReader(filename).readFile();
    }

    public Set<String> getGoalScorers(){
        Set<String> goalScorers = new HashSet<>();
        for (MatchResult matchResult : matchResults) {
            for (String goalScorer : matchResult.getGoalScorers()){
                goalScorers.add(goalScorer);
            }
        }
        return goalScorers;
    }

    public Map<String, Integer> getGoalScorersWithTotals(){
        Map<String, Integer> goalScorersWithTotals = new HashMap<>();
        List<String> goalScorersList = new ArrayList<>();
        Set<String> namesList = this.getGoalScorers();

        int counter = 0;

        for (String name : goalScorersList){
            for (String goals : listOf)
            if (goalScorersList.contains(name)){

            }
            //se hint i præsentation for i dag
        }
    }

    public int getNumberOfGoals(String goalScorer){

    }
}
