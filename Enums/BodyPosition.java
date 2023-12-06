package Enums;

public enum BodyPosition {
    STAND("стоит"), SIT("сидит"), LAY("лежит");

    private final String bodyPosition;

    BodyPosition(String s) {
        this.bodyPosition = s;
    }

    @Override
    public String toString() {
        return this.bodyPosition;
    }
}
