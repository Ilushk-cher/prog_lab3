package Classes;

import Abstracts.Character;

public class Human extends Character {
    public Human(String name, Place localPlace) {
        super(name, localPlace);
    }

    public void imagine() {
        System.out.println(this.getName() + " начинает воображать...");
    }

    public void say(String message) {
        System.out.println(this.getName() + " созывает: \"" + message + "\"");
    }

    public void run() {
        System.out.println(this.getName() + " носится взад-вперед");
    }
}
