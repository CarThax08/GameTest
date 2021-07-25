package com.github.carthax08.game.essentials.screen;

import com.github.carthax08.game.data.GlobalDataStore;
import com.github.carthax08.game.essentials.objects.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    public GamePanel(int width, int height) throws Exception {
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g){
        g.setColor(new Color(90, 255, 175));
        g.fillRect(0, 0, 100, 100);
        drawGameObjects(g);
    }

    private void drawGameObjects(Graphics g) {
        for(GameObject obj : GlobalDataStore.gameObjects){
            obj.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
