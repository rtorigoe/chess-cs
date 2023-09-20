/**
 * @file chessTest.cs
 * @author rtorigoe
 * @version 0.1
 * @date 2023-09-16
 */

/**
 * @brief chessTest.cs: A simple driver file for the pawn and piece classes.
 *                      Used for testing each class and their various methods.
 */

import java.util.Random;

public class chessTest
{
    
    public static void main(String[] args)
    {
        int NUM_PIECES = 4;
        piece[] pieces = initializePieces(NUM_PIECES);
    }

    static piece[] initializePieces(int num)
    {
        Random rand = new Random();
        piece[] pieces = new piece[num];
        for (int i = 0; i < num; i++)
        {
            int row = rand.nextInt(1, 8);
            int col = rand.nextInt(1, 8);
            boolean color;
            if (rand.nextInt(1, 4) > 2) 
            {
                color = true;
            }
            else 
            {
                color = false;
            }
            
            if (rand.nextInt(1, 4) > 2) 
            {
                pieces[i] = new piece(row, col, color);
                System.out.printf("New Piece: Row %s, Column %s, Color %s %n", row, col, color);
            }
            else {
                pieces[i] = new pawn(row, col, color);
                System.out.printf("New Pawn: Row %s, Column %s, Color %s %n", row, col, color);
            }
        }
        return pieces;
    }
}