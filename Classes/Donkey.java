package Classes;

import Abstracts.Character;
import Enums.TailPosition;

public class Donkey extends Character {
    private TailPosition tail;
    public Donkey(String name, Place localPlace, TailPosition tail) {
        super(name, localPlace);
        this.tail = tail;
        System.out.println("Хвост " + this.getName() + " " + this.getTailState());

    }

    public String getTailState() {
        return this.tail.toString();
    }

    public void say(String message) {
        System.out.println(this.getName() + " приговаривает: \"" + message + "\"");
    }

    public void sit() {
        System.out.println(this.getName() + " садится");
    }

    public void setTailState(TailPosition state) {
        System.out.println("Положение хвоста " + this.getName() + " изменяется с \"" + this.getTailState() +
                "\" на \"" + state.toString() + "\"");
        this.tail = state;
    }
}
