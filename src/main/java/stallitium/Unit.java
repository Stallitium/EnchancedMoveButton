package stallitium;

import javax.swing.*;

public class Unit {
    private int x;
    private int y;
    int base;
    private JButton unitButton;
    public Unit(int base,int x, int y, JButton unitButton) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.unitButton = unitButton;
        unitButton.setLocation(x*base,y*base);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public JButton getUnitButton() {
        return unitButton;
    }

    public void setUnitButton(JButton unitButton) {
        this.unitButton = unitButton;
    }

    public void move(int cell,int x,int y) {
        int afX = unitButton.getX()+(x*base);
        int afY = unitButton.getY()+(y*base);
        if (afX > base*cell || afY > base*cell) {
            return;
        }
        unitButton.setLocation(afX,afY);
    }

    public void moveX(int cell,int x) {
        int afX = unitButton.getX()+(x*base);
        if (afX >= base*cell || afX < 0) {
            return;
        }
        unitButton.setLocation(afX,unitButton.getY());
    }

    public void moveY(int cell,int y) {
        int afY = unitButton.getY()+(y*base);
        if (afY >= base*cell || afY < 0) {
            return;
        }
        unitButton.setLocation(unitButton.getX(),afY);
    }

    public void teleport(int x,int y) {
        unitButton.setLocation(x*base,y*base);
    }
}
