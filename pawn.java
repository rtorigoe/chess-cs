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

using System;

namespace chess
{
    class pawn : piece
    {
        private bool promotable;
        private bool unmoved;

        /**
         * @brief ctor
         * 
         * @param x - int, valid values of 0-7
         * @param y - int, valid values of 0-7
         * @param color - bool, valid values of true or false
         * @return public pawn obj
         */

        public pawn(int x, int y, bool color) : base(x, y, color)
        {
            this.promotable = false;
            this.unmoved = true;
        }

        virtual public bool move(int x, int y)
        {
            if ((X_COORD - x != 0) || Math.Abs(Y_COORD - y) > 2)
            {
                throw new ArgumentOutOfRangeException("coordinate out of bounds");
            }
            if (Math.Abs(Y_COORD - y == 2) && (unmoved == false))
            {
                throw new ArgumentOutOfRangeException("pawn cannot move 2 spaces, has moved already");
            }

            Y_COORD = y;
        }
    }
}