package Exceptions;

import Abstracts.Character;

public class MessageYourself extends RuntimeException {
    public MessageYourself(Character character) {
        super("Персонаж " + character.getName() +  " не может отправить сообщение самому себе");
    }
}
