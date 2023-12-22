package Classes;

import Abstracts.Character;
import Enums.TypeOfSpeaking;

import java.util.ArrayList;

public class MessageHistory {
    static ArrayList<MakedMessage> messageHistory = new ArrayList<>();

    public static class MakedMessage {
        private final Character whoSay;
        private final Character whoCatch;
        private final String message;
        private final TypeOfSpeaking typeOfSpeaking;

        private MakedMessage(Character whoSay, Character whoCatch, String message, TypeOfSpeaking typeOfSpeaking) {
            this.whoSay = whoSay;
            this.whoCatch = whoCatch;
            this.message = message;
            this.typeOfSpeaking = typeOfSpeaking;
        }

        public static MakedMessage makeMessage(Character whoSay, Character whoCatch, String message, TypeOfSpeaking typeOfSpeaking) {
            return new MakedMessage(whoSay, whoCatch, message, typeOfSpeaking);
        }

        public Character getWhoSay() {
            return whoSay;
        }

        public Character getWhoCatch() {
            return whoCatch;
        }

        public String getCurMessage() { return message; }

        public TypeOfSpeaking getTypeOfSpeaking() { return typeOfSpeaking; }

        @Override
        public String toString() {
            if (whoCatch == null) {
                return (whoSay + " " + typeOfSpeaking.toString() +": " + message);
            } else {
                return (whoSay + " " + typeOfSpeaking.toString() +" " + whoCatch + ": " + message);
            }
        }

        @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MakedMessage p = (MakedMessage) o;
            return this.message.equals(p.message);
        }

        @Override
        public int hashCode(){
            return message.hashCode();
        }
    }

    public static void addNewMessage(Character whoSay, Character whoCatch, String message, TypeOfSpeaking typeOfSpeaking) {
        messageHistory.add(MakedMessage.makeMessage(whoSay, whoCatch, message, typeOfSpeaking));
    }

    public static void addNewMessage(Character whoSay, String message, TypeOfSpeaking typeOfSpeaking) {
        messageHistory.add(MakedMessage.makeMessage(whoSay, null, message, typeOfSpeaking));
    }

    public static MakedMessage getMakedMessage(int number) {
        return messageHistory.get(number);
    }

    public static ArrayList<MakedMessage> getHistoryMessage() {
        return messageHistory;
    }

    public static void printMessageHistory() {
        for (MakedMessage curMessage : messageHistory) {
            System.out.println(curMessage.toString());
        }
    }

    public static void printNumberedMessage(int number) {
        System.out.println(getMakedMessage(number).toString());
    }
}
