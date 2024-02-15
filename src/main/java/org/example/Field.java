package org.example;

import java.util.List;

public class Field {
    private List<String> commands;
    private int startLength;
    private int startHeight;
    private int length;
    private int height;

    public Field(int length, int height, int startLength, int startHeight, List<String> commands) {
        this.length = length;
        this.height = height;
        this.commands = commands;
        this.startLength = startLength;
        this.startHeight = startHeight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    public int getStartLength() {
        return startLength;
    }

    public void setStartLength(int startLength) {
        this.startLength = startLength;
    }

    public int getStartHeight() {
        return startHeight;
    }

    public void setStartHeight(int startHeight) {
        this.startHeight = startHeight;
    }
}
