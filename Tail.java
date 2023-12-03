public enum Tail {
    UP("поднят"), DOWN("опущен");

    private String tail;

    Tail(String s) {
        this.tail = s;
    }

    @Override
    public String toString() {
        return this.tail;
    }
}
