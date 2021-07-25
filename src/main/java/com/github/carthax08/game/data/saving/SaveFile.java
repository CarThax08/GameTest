package com.github.carthax08.game.data.saving;

import lombok.Getter;

import java.io.File;

public class SaveFile {
    @Getter
    private File file = null;

    public SaveFile(String path){
        file = new File(path);
    }
    public SaveFile(File file){
        this.file = file;
    }
    public void save(){
        //TODO: Game Saving Logic
    }
}
