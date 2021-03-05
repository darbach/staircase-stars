package edu.cnm.deepdive;

/**
 * https://ddc-java-12.github.io/2021/03/01/preview-exam-1-practical-section/
 *
 * In this task, you’ll write code to construct a simple “staircase” of a specified height,
 * returning it as a String[].
 *
 *   * Each String element in the String[] staircase will be made up of a combination of spaces
 *     and asterisks (*).
 *
 *   * The elements will be left-padded with spaces, as necessary, for all of the array elements
 *     in the returned array to have the same length.
 *
 *   * Whatever the specified height, the first element will always have a single asterisk (after
 *     some number of spaces), and the last element will contain only asterisks, with no spaces.
 *     Each element between the first and last will have 1 more asterisk than the previous
 *     element, and 1 less space.
 *
 *   * The bottom step of the staircase will have no padding spaces.
 *
 *   * For example, a correct implementation would return the following for a height of 10:
 *
 *       {
 *           "         *",
 *           "        **",
 *           "       ***".
 *           "      ****",
 *           "     *****",
 *           "    ******",
 *           "   *******",
 *           "  ********",
 *           " *********",
 *           "**********"
 *       }
 *
 *     Note that in this example, with a height of 10, the number of elements in the returned
 *     array is 10; the number of characters in any single step (i.e. array element) is 10, made
 *     of of leading spaces (if any) and asterisks.
 */
public class StaircaseStars {

  private static final String AIR = " ";
  private static final String STONE = "*";

  public static String[] createStairs(int height) {
    String[] stairs = new String[height];
    for (int i = 0; i < height; i++) {
      String level = "";
      for (int j = 0; j < height; j++) {
        if (j < (height - i - 1)) {
          level = level + AIR;
        } else {
          level = level + STONE;
        }
      }
      stairs[i] = level;
    }
    return stairs;
  }

}
