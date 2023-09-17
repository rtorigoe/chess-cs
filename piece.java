/**
 * @file piece.cs
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
**/
    public class piece
    {
        protected int BOARD_WIDTH = 8;
        protected int BOARD_HEIGHT = 8;
        protected int POINT_VAL = 1;
        protected boolean COLOR; // true for white, false for black
        protected int X_COORD;
        protected int Y_COORD;

        /**
     * @brief ctor
     * 
     * @param x - int, valid values of 0-7
     * @param y - int, valid values of 0-7
     * @param color - bool, valid values of true or false
     * @return public piece object
     */

    public piece(int x, int y, boolean color)
    {
        if ((x < 0) || (x > BOARD_WIDTH))
        {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        if ((y < 0) || (y > BOARD_HEIGHT)) 
        {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        this.X_COORD = x;
        this.Y_COORD = y;
        this.COLOR = color;
    }

    /**
     * Pre-Conditions:
     *     - x is within the valid range of values (0 - BOARD_WIDTH - 1)
     *     - y is within the valid range of values (0 - BOARD_LENGTH - 1)
     *
     * Post-Conditions:
     *     - object's x and y values will change to the parameter values  
    **/

    protected boolean makeMove(int x, int y) {
        if ((x < 0) || (x > BOARD_WIDTH)) {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        if ((y < 0) || (y > BOARD_HEIGHT)) {
            throw new ArgumentOutOfRangeException("coordinate out of bounds");
        }
        this.X_COORD = x;
        this.Y_COORD = y;
        return true;
    }
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
 *     - ArgumentOutOfRange exception thrown when the given coordinate is off the board
 *     - Checks the coordinates to see if they're valid coordinates, but invalid to move to
 *     - true is returned upon a correct call to the method, false returned otherwise
**/