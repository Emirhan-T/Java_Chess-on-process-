package Pieces;
import javax.swing.*;
public class Queen extends Pieces {
    public Queen(String color) {
        super(color);
        if(color == "White"){
            this.setIcon(new ImageIcon("res/pieces/w_queen.png"));
        }
        else {
            this.setIcon(new ImageIcon("res/pieces/b_queen.png"));
        }
    }

    @Override
    public boolean isCanMove(int oldX, int oldY, int newX, int newY) {
        if(oldX == newX || oldY== newY)return true;
        else if(Math.abs(newX-oldX)==Math.abs(newY-oldY)) return true;
        return false;
    }
}
