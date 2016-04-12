package com.company.files;

public class FileNameEncryption {

    private static int SHIFT = 1;

    public static void encode(File file){
        StringBuilder name = new StringBuilder(file.getName());
        for (int i = 0; i < name.length(); i++){
            char a = name.charAt(i);
            a = (char)(a + SHIFT);
            name.setCharAt(i, a);
        }
        file.setName(name.toString());
    }

    public static void decode(File file){
        StringBuilder name = new StringBuilder(file.getName());
        for (int i = 0; i < name.length(); i++){
            char a = name.charAt(i);
            a = (char)(a - SHIFT);
            name.setCharAt(i, a);
        }
        file.setName(name.toString());
    }
}
