package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;
import Enums.TypeOfSpeaking;

public class Donkey extends Animal {
    public Donkey(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Donkey(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Donkey(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    @Override
    public void say(String message) {
        super.say(message, TypeOfSpeaking.SENTENCING);
    }
}
