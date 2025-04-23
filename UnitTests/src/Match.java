public class Match {
    private int team1Score;
    private int team2Score;
    private int matchNumber;

    public Match(int team1Score, int team2Score, int matchNumber){
        this.team1Score = team1Score;
        this.team2Score = team2Score;
        this.matchNumber = matchNumber;
    }

    public int getTeam1Score(){
        return team1Score;
    }

    public void setTeam1Score(int team1Score){
        this.team1Score = team1Score;
    }

    public int getTeam2Score(){
        return team2Score;
    }

    public void setTeam2Score(int team2Score){
        this.team2Score = team2Score;
    }

    public int getMatchNumber(){
        return matchNumber;
    }

    public void setMatchNumber(int matchNumber){
        this.matchNumber = matchNumber;
    }

    public String winner(){
        if(team1Score > team2Score){
            return "Team 1 wins with a score of " + team1Score;
        } else if(team1Score < team2Score){
            return "Team 2 wins with a score of " + team2Score;
        }
        return "The match is a tie";
    }

    public int getScoreDifference(){
        return Math.abs(team1Score - team2Score);
    }

    public static String winnerByPointsDiff(Match[] matches){
        int biggestDifference = 0;
        Match pointsMatch = null;

        for (int i = 0; i < matches.length; i++) {
            if(matches[i].getScoreDifference() > biggestDifference){
                pointsMatch = matches[i];
                biggestDifference = pointsMatch.getScoreDifference();
            }
        }
        if(pointsMatch == null){
            return "There were no matches today";
        }

        return  "The match with the biggest score difference was match number " + pointsMatch.getMatchNumber() +
                " with a difference of " + pointsMatch.getScoreDifference() + " points";
    }


}
