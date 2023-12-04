package Classes;

import Abstracts.Character;

public class Rabbit extends Character {
    public Rabbit(String name, Place localPlace) {
        super(name, localPlace);
    }

    public void say(String message) {
        System.out.println(this.getName() + " созывает: \"" + message + "\"");
    }

    public void run() {
        System.out.println(this.getName() + " носится взад-вперед");
    }
}
