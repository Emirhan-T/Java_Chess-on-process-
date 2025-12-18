package Pieces;

import javax.swing.*;

public class pieces extends JLabel {
    ImageIcon pawn_w = new ImageIcon("res/pieces/w_pawn.png");
    ImageIcon pawn_b = new ImageIcon("res/pieces/b_pawn.png");
    ImageIcon bishop_w = new ImageIcon("res/pieces/w_bishop.png");
    ImageIcon bishop_b = new ImageIcon("res/pieces/b_bishop.png");
    ImageIcon knight_w = new ImageIcon("res/pieces/w_knight.png");
    ImageIcon knight_b = new ImageIcon("res/pieces/b_knight.png");
    ImageIcon rook_w = new ImageIcon("res/pieces/w_rook.png");
    ImageIcon rook_b = new ImageIcon("res/pieces/b_rook.png");
    ImageIcon king_w = new ImageIcon("res/pieces/w_king.png");
    ImageIcon king_b = new ImageIcon("res/pieces/b_king.png");
    ImageIcon queen_w = new ImageIcon("res/pieces/w_queen.png");
    ImageIcon queen_b = new ImageIcon("res/pieces/b_queen.png");
    public pieces(String piece, String color) {
        if (piece.equals("pawn_w")) {
            this.setIcon(pawn_w);
        } else if (piece.equals("pawn_b")) {
            this.setIcon(pawn_b);
        }
        else if (piece.equals("bishop_w")) {
            this.setIcon(bishop_w);
        }
        else if (piece.equals("bishop_b")) {
            this.setIcon(bishop_b);
        }
        else if (piece.equals("knight_w")) {
            this.setIcon(knight_w);
        }
        else if (piece.equals("knight_b")) {
            this.setIcon(knight_b);
        }
        else if (piece.equals("rook_w")) {
            this.setIcon(rook_w);
        }
        else if (piece.equals("rook_b")) {
            this.setIcon(rook_b);
        }
        else if (piece.equals("king_w")) {
            this.setIcon(king_w);
        }
        else if (piece.equals("king_b")) {
            this.setIcon(king_b);
        }
        else if (piece.equals("queen_w")) {
            this.setIcon(queen_w);
        }
        else if (piece.equals("queen_b")) {
            this.setIcon(queen_b);
        }

        this.setHorizontalAlignment(JLabel.CENTER);
    }


}
