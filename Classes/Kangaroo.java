package Classes;

import Abstracts.Character;

public class Kangaroo extends Character {
    public Kangaroo(String name, Place localPlace) {
        super(name, localPlace);
    }

    public void say(String message) {
        System.out.println(this.getName() + " говорит: \"" + message + "\"");
    }

    public void jump() {
        System.out.println(this.getName() + " огромными скачками несется по " + this.destinto());
    }

    public void swim() {
        System.out.println(this.getName() + " плавает");
    }
}
