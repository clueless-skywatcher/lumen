package io.lumenlog;

public enum LogColor {
    RED(31),
    CYAN(36),
    GREEN(32),
    YELLOW(33);

    private int colorNum;

    public int getColorNum() {
        return this.colorNum;
    }

    private LogColor(int colorNum) {
        this.colorNum = colorNum;
    }
}
