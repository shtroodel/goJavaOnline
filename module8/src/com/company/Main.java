package com.company;

import com.company.files.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Directory dir = new Directory();
        List<File> fileList = new ArrayList<>();
        fileList.add(new MusicFile("Imagine", "dir", 10, "John Lennon", 3));
        fileList.add(new MusicFile("Smoke on the water", "dir", 15, "Deep purpule", 3));
        fileList.add(new PictureFile("Wallpaper1", "dir", 20, "jpg"));
        fileList.add(new TextFile("trampampam", "dir", 7, "txt", "English"));

        dir.setFiles(fileList);

        dir.printDirContent();
    }
}
