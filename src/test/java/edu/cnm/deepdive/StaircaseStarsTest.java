package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaircaseStarsTest {

  @Test
  void createStairs() {
    int[] params = {
        1,
        10
    };
    String[][] expected = {
        {
            "*"
        },
        {
            "         *",
            "        **",
            "       ***",
            "      ****",
            "     *****",
            "    ******",
            "   *******",
            "  ********",
            " *********",
            "**********"
        }
    };
    for (int i = 0; i < params.length; i++) {
      String[] actual = StaircaseStars.createStairs(params[i]);
      assertArrayEquals(expected[i], actual);
    }
  }
}