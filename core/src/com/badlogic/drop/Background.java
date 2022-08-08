package com.badlogic.drop;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
public class Background extends javax.swing.JFrame {
    Image img = Toolkit.getDefaultToolkit().getImage("H:\\dmc5.jpg");
    public Background() throws IOException {
        this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 800, 480, null);
            }
        });
        pack();
        setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new Background();
    }
}