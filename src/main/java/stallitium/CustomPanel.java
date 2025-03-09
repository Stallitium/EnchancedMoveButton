package stallitium;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    int base;
    int cell;
    int line;

    public CustomPanel(int base, int cell) {
        this.base = base;
        this.cell = cell;
        this.line = cell + 1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        //縦線
        for (int x = 0; x <= cell * base; x += 1 * base) {
            g2d.drawLine(x, 0, x, cell * base);
        }
        //横線
        for (int y = 0; y <= cell * base; y += 1 * base) {
            g2d.drawLine(0, y, cell * base, y);
        }
    }
}

//        //縦線
//        for (int x = 1*base; x <= line*base; x+=1*base) {
//            g2d.drawLine(x,1*base,x,line*base);
//        }
//        //横線
//        for (int y = 1*base; y <= line*base; y+=1*base) {
//            g2d.drawLine(1*base,y,line*base,y);
//        }

        //大失敗
//        for (int x = 10; x <= 100; x+=10) {
//            for (int y = 10; y<= 100; y+=10) {
//                g2d.drawLine(x,y,100,100);
//            }
//        }


