package com.company;

import java.io.*;

public class Write {

    public void write(String file, String massage) throws FileNotFoundException {
        try {
            java.io.Writer w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file))));
            w.write(massage);
            w.close();
        } catch (IOException e){
            System.err.println("Problem writing to the file!");
        }
    }
}
