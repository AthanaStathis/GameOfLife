
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDtests {
    String[][] scenarioOneBoardOne = {
                                        {".", ".", ".", "."},
                                        {".", "*", "*", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."}
                                    };

    String[][] scenarioOneBoardTwo = {
                                        {".", ".", ".", "."},
                                        {".", ".", "*", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."}
                                     };

    String[][] scenarioOneBoardThree = {
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."},
                                        {".", ".", ".", "."}
                                    };

    @Test
    void cell_with_less_than_two_neighbors_die() {
        Board board1 = new Object();
        Board board2 = new Object();
        assertEquals(board1.nextGeneration(), board2);
    }



}
