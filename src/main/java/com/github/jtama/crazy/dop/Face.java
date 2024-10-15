package com.github.jtama.crazy.dop;

public enum Face {
    JACK("Jack"),
    KNIGHT("Knight"),
    QUEEN("Queen"),
    KING("King");

    private final String displayName;

    Face(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
