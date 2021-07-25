package com.github.carthax08.game.essentials.objects;

import com.github.carthax08.game.GameLoader;
import com.github.carthax08.game.essentials.errors.TextureNotFoundException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URISyntaxException;

public class GameObject {

    public int width, height;
    public BufferedImage texture;
    public int x,y;

    public GameObject(int width, int height, String texturePath, int x, int y) throws Exception {
        this.width = width;
        this.height = height;
        File file = new File(GameLoader.getJarContainingFolder() + System.getProperty("file.separator") + texturePath);
        if(file.exists()) {
            texture = ImageIO.read(file);
        }else{
            throw new TextureNotFoundException("Texture at " + GameLoader.getJarContainingFolder() + System.getProperty("file.separator") + texturePath + " was not found. Please try uninstalling and re-installing");
        }
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g){
        g.drawImage(texture, 200, 200, width, height, null);
    }

}
