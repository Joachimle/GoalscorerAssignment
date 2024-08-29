import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchResultFileReader {

    private Scanner scanner;

    public MatchResultFileReader(String filename) throws FileNotFoundException {
        File file = new File(filename);
        scanner = new Scanner(file);
    }

    public List<MatchResult> readFile() {
        ArrayList<MatchResult> matchResults = new ArrayList<>();

        while(scanner.hasNext()){
            ArrayList<String> playerList = new ArrayList<>();
            String[] splitLine = scanner.nextLine().split(";");
            String[] splitPlayers = splitLine[1].split(",");
            for (int i = 0; i < splitPlayers.length; i++) {
                playerList.add(splitPlayers[i]);
            }
            MatchResult matchResult = new MatchResult(splitLine[0], playerList);
            matchResults.add(matchResult);
        }

        scanner.close();

        return matchResults;
    }


}
