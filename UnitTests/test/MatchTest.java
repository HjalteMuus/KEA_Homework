import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @Test
    void getTeam1Score() {
        Match m1 = new Match(1,4,1);
        Match m2 = new Match(4,2,2);
        Match m3 = new Match(3,3,3);
        assertEquals(1, m1.getTeam1Score());
        assertEquals(4, m2.getTeam1Score());
        assertEquals(3, m3.getTeam1Score());
    }

    @Test
    void getTeam2Score() {
        Match m1 = new Match(1,4,1);
        Match m2 = new Match(4,2,2);
        Match m3 = new Match(3,3,3);
        assertEquals(4, m1.getTeam2Score());
        assertEquals(2, m2.getTeam2Score());
        assertEquals(3, m3.getTeam2Score());
    }

    @Test
    void getMatchNumber() {
        Match m1 = new Match(1,4,1);
        Match m2 = new Match(4,2,2);
        Match m3 = new Match(3,3,3);
        assertEquals(1, m1.getMatchNumber());
        assertEquals(2, m2.getMatchNumber());
        assertEquals(3, m3.getMatchNumber());
    }

    @Test
    void winner() {
        Match m1 = new Match(1,4,1);
        Match m2 = new Match(4,2,2);
        Match m3 = new Match(3,3,3);
        assertEquals("Team 2 wins with a score of 4", m1.winner());
        assertEquals("Team 1 wins with a score of 4", m2.winner());
        assertEquals("The match is a tie", m3.winner());
    }

    @Test
    void getScoreDifference() {
        Match m1 = new Match(1,4,1);
        Match m2 = new Match(4,2,2);
        Match m3 = new Match(3,3,3);
        assertEquals(3, m1.getScoreDifference());
        assertEquals(2, m2.getScoreDifference());
        assertEquals(0, m3.getScoreDifference());
    }

    @Test
    void winnerByPointsDiff() {
        Match[] matches = {new Match(1, 4, 1),
                           new Match(4, 2, 2),
                           new Match(3, 3, 3)};
        assertEquals("The match with the biggest score difference was match number 1 with a difference of 3 points",
                     Match.winnerByPointsDiff(matches));
    }

    @Test
    void sortMatches(){
        ArrayList<Match> matches = new ArrayList<>();
        matches.add(new Match(1, 4, 1));
        matches.add(new Match(3, 3, 3));
        matches.add(new Match(4, 2, 2));

        ArrayList<Match> sortedMatches = Match.sortMatches(matches);
        Collections.reverse(sortedMatches);

        assertEquals(3 , sortedMatches.get(0).getScoreDifference());
        assertEquals(2 , sortedMatches.get(1).getScoreDifference());
        assertEquals(0 , sortedMatches.get(2).getScoreDifference());
    }
}