
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDtests{
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
        Board nextGeneration() {}
        assertEquals(scenarioOneBoardTwo[1][2].nextGeneration(), scenarioOneBoardThree[1][2]);



}
