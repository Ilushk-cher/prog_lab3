package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;
import Enums.TypeOfSpeaking;

public class Donkey extends Animal implements Cloneable {
    private final TypeOfSpeaking typeOfSpeaking = TypeOfSpeaking.SENTENCING;

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
        super.say(message, this.typeOfSpeaking);
    }

    @Override
    public Donkey clone() throws CloneNotSupportedException {
        return (Donkey) super.clone();
    }
}
