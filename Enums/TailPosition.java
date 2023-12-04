package Enums;

public enum TailPosition {
    UP("поднят"), DOWN("опущен");

    private String tail;

    TailPosition(String s) {
        this.tail = s;
    }

    @Override
    public String toString() {
        return this.tail;
    }
}
