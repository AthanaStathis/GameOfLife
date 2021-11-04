
import org.junit.jupiter.api.Test;
import org.w3c.dom.html.HTMLFrameSetElement;

import javax.swing.*;

import java.awt.*;
import java.security.KeyPairGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDtests {
    String[][]boardOneScenarioOne = {
            {".", ".", ".", ".", "."},
            {".", "*", "*", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
    };

    String[][]boardTwoScenarioOne = {
            {".", ".", ".", ".", "."},
            {".", ".", "*", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
    };

    String[][]boardThreeScenarioOne = {
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
            {".", ".", ".", ".", "."},
    };

    @Test
    void initialize_board_to_scenario_one() {
        Board board = new Board(6, 5);
        assertEquals(board.initialize()[0][0], boardOneScenarioOne[0][0]);
        assertEquals(board.initialize()[1][1], boardOneScenarioOne[1][1]);
        assertEquals(board.initialize()[1][2], boardOneScenarioOne[1][2]);
    }

    @Test
    void method_nextGeneration_applied_to_boardOneScenarioOne_gives_boardTwoScenarioOne() {
        assertEquals(boardOneScenarioOne[1][1].nextGeneration(), boardTwoScenarioOne[1][1]);
    }




}
