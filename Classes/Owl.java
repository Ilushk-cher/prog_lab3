package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;
import Enums.TypeOfSpeaking;

public class Owl extends Animal {
    private final TypeOfSpeaking typeOfSpeaking = TypeOfSpeaking.EXPLANATION;

    public Owl(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Owl(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Owl(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    @Override
    public void say(String message) {
        super.say(message, this.typeOfSpeaking);
    }
}
