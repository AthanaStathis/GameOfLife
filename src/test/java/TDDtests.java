import org.junit.jupiter.api.Test;


import javax.swing.text.html.AccessibleHTML;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDtests {

    @Test
    void isAlive() {
        AccessibleHTML.TableElementInfo board = null;
        assertEquals(board.getCell(0).isAlive());
    }

}
