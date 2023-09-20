/**
 * @file pawn.cs
 * @author rtorigoe
 * @version 0.1
 * @date 2023-09-16
 */

/**
 * CLASS INVARIANT
 * 
 * Exceptions: CLIENT MUST HANDLE ALL EXCEPTIONS
 * 
 */

import java.lang.Math;

public class pawn extends piece
{
    private boolean PROMOTABLE;
    private boolean UNMOVED;

    /**
     * @brief ctor
     * 
     * @param x - int, valid values of 0-7
     * @param y - int, valid values of 0-7
     * @param color - bool, valid values of true or false
     * @return public pawn obj
     */

    public pawn(int x, int y, boolean color) {
        super(x, y, color);
        this.PROMOTABLE = false;
        this.UNMOVED = true;
    }

    /**
     * Pre-Conditions:
     *     - x is within the valid range of values (0 - BOARD_WIDTH - 1)
     *     - y is within the valid range of values (0 - BOARD_LENGTH - 1)
     * 
     * Post-Conditions:
     *     - object's x and y values will change to the desired values
     */

    @Override public boolean move(int x, int y) {
        try {
            if ((X_COORD - x != 0) || Math.abs(Y_COORD - y) > 2) {
                throw new Exception("invalid coordinate to move to");
            }
            if (Math.abs(Y_COORD - y) == 2 && (UNMOVED == false)) {
                throw new Exception("pawn cannot move 2 spaces, has moved already");
            }
            Y_COORD = y;
            UNMOVED = false;
            return true;
        }
        catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
}

/**
 * IMPLEMENTATION INVARIANT
 * 
 * Members:
 *     - PROMOTABLE and UNMOVED are stored as booleans to represent dicotomy (either true or false)
 * 
 * Constructor:
 *     - Sets PROMOTABLE to false by default
 *     - Sets UNMOVED to true by default
 * 
 * Methods:
 *     - move():
 *         - Exceptions thrown if the pawn cannot move to the desired space
 *         - Otherwise sets the y coordinate to the desired location and sets UNMOVED to false
 */