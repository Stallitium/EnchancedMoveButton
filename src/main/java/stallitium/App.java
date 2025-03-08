package stallitium;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App extends JFrame implements KeyListener {
    JPanel panel;
    JButton unit1;
    Unit unit;
    int base,cell;
    public void run() {
        base = 70;
        cell= 9;
        panel = new CustomPanel(base,cell);
        panel.setLayout(null);

        unit1 = new JButton("unit1");
        unit = new Unit(base,0,0,unit1);
        unit1.setSize(base,base);
        unit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.requestFocusInWindow();
            }
        });
        panel.add(unit1);


        panel.addKeyListener(this);
        panel.setFocusable(true);
        panel.requestFocusInWindow();

        this.add(panel);
        this.setSize(900,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (c == 'w') {
            unit.moveY(base,cell,-1);
        } else if (c == 's') {
            unit.moveY(base,cell,1);
        } else if (c == 'a') {
            unit.moveX(base,cell,-1);
        } else if (c == 'd') {
            unit.moveX(base,cell,1);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // キーが押されたときの処理
//        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // キーが離されたときの処理
    }

    public static void main( String[] args ) {
        new App().run();
    }
}
