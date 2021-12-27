import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String leagueName;
    private ArrayList<T> teams = new ArrayList<T>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(T newTeam){
        if (teams.contains(newTeam)) {
            System.out.println(newTeam.getName() +" not added. Cause you already have the team with such name in the League");
            return false;
        }
        if (newTeam==null) {
            System.out.println("You can not add noname team to the League");
            return false;
        }
        teams.add(newTeam);
        System.out.println("New team " + newTeam.getName() + " was added to League " + this.leagueName);
        return true;
    }

    public void printLeagueTable () {
        Collections.sort(teams);
        System.out.println("The ranking table of your League");
        System.out.println("#\tTeam\tPlayed\tWon\tLost\tTied\tScores");
        for (int i=0; i< teams.size();i++){
            System.out.println((i+1)+".\t" +teams.get(i).getName() + "\t" + teams.get(i).played + "\t" +
                    teams.get(i).won + "\t" +teams.get(i).lost + "\t\t" + teams.get(i).tied + "\t\t"
                    + teams.get(i).ranking() + " points");
        }

    }
}
