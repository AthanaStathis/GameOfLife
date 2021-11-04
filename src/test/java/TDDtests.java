
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
        assertEquals(board.initialize(), boardOneScenarioOne);
    }




}
