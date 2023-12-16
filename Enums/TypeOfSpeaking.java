package Enums;

public enum TypeOfSpeaking {
    SPEAK("говорит"), SCREAM("кричит"), EXPLANATION("объясняет"), SENTENCING("приговариет");

    private final String typeOfSpeaking;

    TypeOfSpeaking(String s) { this.typeOfSpeaking = s; }

    @Override
    public String toString() {
        return this.typeOfSpeaking;
    }
}
