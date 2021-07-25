package com.github.carthax08.game.essentials.screen;

import com.github.carthax08.game.GameLoader;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {
    public GameFrame(int width, int height) throws Exception {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                GameLoader.exitGame();
            }
        });
        this.setContentPane(new GamePanel(width, height));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
