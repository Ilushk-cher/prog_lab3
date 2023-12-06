package Enums;

public enum TypeOfJump {
    ON_SPOT("на месте"), HUGE_LEAPS("огромными скачками"), NONE("никак");

    private final String typeOfJump;

    TypeOfJump(String s) {
        this.typeOfJump = s;
    }

    @Override
    public String toString() {
        return this.typeOfJump;
    }
}
