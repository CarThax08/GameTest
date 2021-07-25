package com.github.carthax08.game.essentials.errors;

public class TextureNotFoundException extends Exception{
    public TextureNotFoundException(String message){
        super(message);
        super.printStackTrace();
        System.exit(0);
    }
}
