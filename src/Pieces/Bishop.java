package Pieces;
import javax.swing.*;
public class Bishop extends Pieces {
    public Bishop(String color) {
        super(color);
        if(color == "White"){
            this.setIcon(new ImageIcon("res/pieces/w_bishop.png"));
        }
        else {
            this.setIcon(new ImageIcon("res/pieces/b_bishop.png"));
        }
    }

    @Override
    public boolean isCanMove(int oldX, int oldY, int newX, int newY) {
        if(Math.abs(newX-oldX)==Math.abs(newY-oldY)) return true;
        return false;
    }
}
