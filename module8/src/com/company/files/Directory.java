package com.company.files;

import java.util.List;

public class Directory {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void printDirContent() {
        this.files
                .stream()
                .forEach(e -> System.out.println(e.getName() + "\t" + e.getAddress() + "\t" + e.getSize()));
    }
}
