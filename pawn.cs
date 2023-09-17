/**
 * @file pawn.cpp
 * @author rtorigoe
 * @version 0.1
 * @date 2023-09-16
 */

/**
 * CLASS INVARIANT
 * 
 * Exceptions: CLIENT MUST HANDLE ALL EXCEPTIONS
 * 
 * 
 */

namespace chess {
    class piece
    {
        protected const int BOARD_WIDTH = 8;
        protected const int BOARD_LENGTH = 8;
        protected const int POINT_VAL = 1;
        protected const bool COLOR; // true for white, false for black
        protected int X_COORD;
        protected int Y_COORD:
        
    }

    /**
     * Pre-Conditions:
     *     - x is within the valid range of values (0 - BOARD_WIDTH - 1)
     *     - y is within the valid range of values (0 - BOARD_LENGTH - 1)
     *
     * Post-Conditions:
     *     - object's x and y values will change to the parameter values  
    **/

    protected bool makeMove(int x, int y) {
        if ((x < 0) || (x > BOARD_WIDTH)) {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        if ((y < 0) || (y > BOARD_HEIGHT)) {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        if (this.X_COORD != 0) {
            return false;
        }
        if (this.COLOR == true) {
            if (this.Y_COORD - y != 1) {
                return false;
            }
        }
        if (this.COLOR == false) {
            if (this.Y_COORD - y != -1) {
                return false;
            }
        }
        
        this.x = x;
        this.y = y;
        return true;
    }

    /**
     * IMPLEMENTATION INVARIANT
     *
     * Members: 
     *     - BOARD_LENGTH, BOARD_WIDTH, COLOR, AND POINT_VAL are kept constant to refrain from changes
     *     - COLOR is stored as a boolean to represent two possibilities of color (black or white)
     * 
     * Methods:
     *     - makeMove:
     *         - ArgumentOutOfRange exception thrown when the given coordinate is off the board
     *         - Checks the coordinates to see if they're valid coordinates, but invalid to move to
     *         - true is returned upon a correct call to the method, false returned otherwise
    **/
}