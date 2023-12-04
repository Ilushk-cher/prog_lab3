package Classes;

import Abstracts.Character;

public class Owl extends Character {
    public Owl(String name, Place localPlace) {
        super(name, localPlace);
    }

    public void say(String message) {
        System.out.println(this.getName() + " объясняет: \"" + message + "\"");
    }
}
