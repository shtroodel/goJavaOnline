package com.company.files;

public class TextFile extends File {
    private String style;
    private String language;

    public TextFile(String name, String address, int size, String style, String language) {
        super(name, address, size);
        this.style = style;
        this.language = language;
    }

    public String getStyle() {
        return style;
    }

    public String getLanguage() {
        return language;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
