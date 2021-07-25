package com.github.carthax08.game;

import com.github.carthax08.game.data.GlobalDataStore;
import com.github.carthax08.game.essentials.objects.GameObject;
import com.github.carthax08.game.essentials.screen.GameFrame;

import javax.swing.*;
import java.io.File;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.CodeSource;

public class GameLoader {
    private static JFrame gameFrame;
    public static void main(String[] args) throws Exception {
        gameFrame = new GameFrame(1280, 720);
        GlobalDataStore.gameObjects.add(new GameObject(256, 256, "textures" + System.getProperty("file.separator") + "player.png", 200, 200));
        GlobalDataStore.gameObjects.add(new GameObject(128, 128, "textures" + System.getProperty("file.separator") + "player.png", 200, 200));
    }

    public static void exitGame() {
        gameFrame.dispose();
        System.out.println("Saving Finished, Game Exiting");
        System.exit(0);
    }
    public static String getJarContainingFolder() throws Exception {
        String separator = System.getProperty("file.separator");
        File currentJavaJarFile = new File(GameLoader.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String currentJavaJarFilePath = currentJavaJarFile.getParent() + separator + "resources";
        return currentJavaJarFilePath.replace(currentJavaJarFile.getName(), "");
    }
}
