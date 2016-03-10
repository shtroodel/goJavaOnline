package com.github.files;

public class TextFile extends File {
    private String style;
    private String language;

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
