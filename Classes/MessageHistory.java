package Classes;

import Abstracts.Character;
import Enums.TypeOfSpeaking;

import java.util.ArrayList;

public class MessageHistory {
    static ArrayList<MakedMessage> messageHistory = new ArrayList<>();

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
