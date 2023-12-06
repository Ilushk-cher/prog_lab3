package Classes;

import Abstracts.Animals;
import Enums.BodyPosition;
import Enums.TailPosition;

public class Owl extends Animals {
    public Owl(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Owl(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Owl(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    public void say(String message) {
        System.out.println(this.getName() + " объясняет: \"" + message + "\"");
    }
}
