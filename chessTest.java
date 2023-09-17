/**
 * @file chessTest.cs
 * @author rtorigoe
 * @version 0.1
 * @date 2023-09-16
 */

/**
 * @brief chessTest.cs: A simple driver file for the pawn and piece classes.
 *                      Used for testing each class and their various methods.
 *                      - 
 */

namespace chess
{
    public class chessTest
    {
        const int NUM_PIECES;
        static void Main(string[] args)
        {
            piece[] pieces = initializePieces(NUM_PIECES);
        }

        static piece[] initializePieces(int num)
        {
            Random.rand = new Random();
            piece[] pieces = new piece[num];
            for (int i = 0; i < num; i++)
            {
                int row = rand.Next(1, 8);
                int col = rand.Next(1, 8);
                bool color;
                if (rand.Next(1, 4) > 2) 
                {
                    color = true;
                }
                else 
                {
                    color = false;
                }
                
                if (rand.Next(1, 4) > 2) 
                {
                    pieces[i] = new piece(row, col, color);
                }
                else {
                    pieces[i] = new pawn(row, col, color);
                }
            }
        }
    }
}