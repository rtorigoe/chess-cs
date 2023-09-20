/**
 * @file piece.java
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
    protected int TYPE;
    protected boolean COLOR; // true for white, false for black

    /**
     * @brief ctor
     * @param color - bool, valid values of true or false
     * @param type - int, valid values of 1 - 6 (1 = pawn, 2 = knight...)
     * @return public piece object
    **/

    public piece(boolean color, int type)
    {
        COLOR = color;
        TYPE = type;
    }
}

/**
 * IMPLEMENTATION INVARIANT
 * 
 * Members: 
 *     - COLOR is stored as a boolean to represent two possibilities of color (black or white)
 *     - TYPE is stored as an int for easier identification of pieces (primitive type over String)
**/