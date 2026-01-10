package Pieces;

import javax.swing.*;

public class Rook extends Pieces {
    public Rook(String color) {
        super(color);
        if (color.equals("Black")) {
            this.setIcon(new ImageIcon("res/pieces/b_rook.png"));

        }
        else {
            this.setIcon(new ImageIcon("res/pieces/w_rook.png"));
        }
    }

    @Override
    public boolean isCanMove(int oldX, int oldY, int newX, int newY) {
        if(oldX == newX || oldY== newY)return true;
        return false;
    }
}
