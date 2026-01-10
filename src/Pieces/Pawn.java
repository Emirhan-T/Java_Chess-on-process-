package Pieces;
import javax.swing.*;
public class Pawn extends Pieces {
    public Pawn(String color) {
        super(color);
        if (color.equals("White")) {
            this.setIcon(new ImageIcon("res/pieces/w_pawn.png"));
        }
        else if (color.equals("Black")) {
            this.setIcon(new ImageIcon("res/pieces/b_pawn.png"));
        }
    }

    @Override
    public boolean isCanMove(int oldX, int oldY, int newX, int newY) {
        if(oldY != newY) return false;
        if(color.equals("White")){
            if(oldX == 6 && oldX-newX==2) return true;
            if(oldX-newX==1) return true;
        }
        if(color.equals("Black")){
            if(oldX == 1 && newX-oldX==2) return true;
            if(newX-oldX==1) return true;
        }
        return false;
    }
}
