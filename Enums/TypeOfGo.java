package Enums;

public enum TypeOfGo {
    STOP("стоит"), GO("идет"), RUN("носится");

    private final String typeOfGo;

    TypeOfGo(String s) {
        this.typeOfGo = s;
    }

    @Override
    public String toString() {
        return this.typeOfGo;
    }
}
