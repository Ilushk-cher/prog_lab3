package Enums;

public enum TailPosition {
    UP("поднят"), DOWN("опущен");

    private final String tailPosition;

    TailPosition(String s) {
        this.tailPosition = s;
    }

    @Override
    public String toString() {
        return this.tailPosition;
    }
}
