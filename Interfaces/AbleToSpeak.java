package Interfaces;

import Abstracts.Character;

public interface AbleToSpeak {
    void say(String message);

    void catchMessage(Character character, String message);

    void sendMessage(Character character, String message);

    void answerMessage(String message);
}
