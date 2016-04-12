package com.company;

import com.company.files.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Directory dir = new Directory();
        List<File> fileList = new ArrayList<>();

        MusicFile imagine = new MusicFile("Imagine", "dir", 10, "John Lennon", 3);
        MusicFile smokeOnTheWater = new MusicFile("Smoke on the water", "dir", 15, "Deep purpule", 3);
        PictureFile wallpaper1 = new PictureFile("Wallpaper1", "dir", 20, "jpg");
        TextFile trampampam = new TextFile("trampampam", "dir", 7, "txt", "English");

        fileList.add(imagine);
        fileList.add(smokeOnTheWater);
        fileList.add(wallpaper1);
        fileList.add(trampampam);

        FileNameEncryption.encode(imagine);
        FileNameEncryption.encode(smokeOnTheWater);

        dir.setFiles(fileList);

        System.out.println("After file name encoding: \n");
        dir.printDirContent();

        FileNameEncryption.decode(imagine);
        FileNameEncryption.decode(smokeOnTheWater);

        System.out.println("\n\nAfter file name decoding: \n");
        dir.printDirContent();
    }
}
