import Pieces.pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {

    int boxSize = 50;
    JPanel [][]loc = new JPanel [8][8];

    boolean Select=false;
    JPanel NextSelectedSquare= null;
    JPanel OldSelectedSquare= null;
    Color oldColor=null;

    public GamePanel() {
        Table();
        Pieces();


    }
    void Pieces(){
        for (int i = 0; i < 8; i++) {
            loc[6][i].add(new pieces("pawn_w","white"));
            loc[1][i].add(new pieces("pawn_b","black"));
        }
        for (int i = 0; i < 8; i=i+7) {
            for (int j = 0; j < 8; j=j+7) {
                if (j%2==0) {
                    loc[j][i].add(new pieces("rook_b","black"));
                }
                else {
                    loc[j][i].add(new pieces("rook_w","white"));
                }
            }
        }
        for (int i = 1; i < 8; i=i+5) {
            for (int j = 0; j < 8; j=j+7) {
                if (j%2==0) {
                    loc[j][i].add(new pieces("knight_b","black"));
                }
                else {
                    loc[j][i].add(new pieces("knight_w","white"));
                }
            }
        }
        for (int i = 2; i < 8; i=i+3) {
            for (int j = 0; j < 8; j=j+7) {
                if (j%2==0) {
                    loc[j][i].add(new pieces("bishop_b","black"));
                }
                else {
                    loc[j][i].add(new pieces("bishop_w","white"));
                }
            }
        }
            loc[0][3].add(new pieces("queen_b","black"));
            loc[7][3].add(new pieces("queen_w","white"));
            loc[0][4].add(new pieces("king_b","black"));
            loc[7][4].add(new pieces("king_w","white"));
    }

    void Table(){
        int y_axis=50;
        this.setLayout(null);
        for(int i = 0; i<8;i++){

            int x_axis = 50;
            for(int j = 0; j<8;j++){
                JPanel panel = new JPanel();
                if((i+j) % 2 == 0){
                    Color light = new Color(248, 227, 176);
                    panel.setBackground(light);
                    panel.setBounds(x_axis, y_axis, boxSize, boxSize);
                }
                else {
                    Color dark = new Color(1, 204, 197);
                    panel.setBackground(dark);
                    panel.setBounds(x_axis, y_axis, boxSize, boxSize);
                }
                mouseMovment(panel);
                loc[i][j] = panel;
                x_axis = x_axis + boxSize;
                this.add(panel);
            }
            y_axis = y_axis + boxSize;
        }
    }
    void mouseMovment(JPanel p){
        p.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {

                if(!Select){
                    if(p.getComponentCount() >0){
                        NextSelectedSquare = p;
                        oldColor = p.getBackground();
                        p.setBackground(new Color(255, 144, 73));
                        Select=true;
                        OldSelectedSquare = p;
                    }
                }
                else if(Select){
                    NextSelectedSquare = p;
                    if(OldSelectedSquare == NextSelectedSquare){
                        Select=false;
                        p.setBackground(oldColor);
                    }
                    else{
                        Component piece =  OldSelectedSquare.getComponent(0);
                        p.removeAll();
                        p.add(piece);
                        OldSelectedSquare.setBackground(oldColor);
                        OldSelectedSquare.repaint();
                        NextSelectedSquare.repaint();
                        OldSelectedSquare.revalidate();
                        NextSelectedSquare.revalidate();
                        p.repaint();
                        p.revalidate();
                        Select = false;


                    }

                }





            }
        });
    }

}


