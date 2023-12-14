package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;

public class Rabbit extends Animal {
    public Rabbit(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Rabbit(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Rabbit(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    public void say(String message) {
        System.out.println(this.getName() + " созывает: \"" + message + "\"");
    }
}
