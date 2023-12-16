package Abstracts;

import Classes.Place;
import Enums.BodyPosition;
import Enums.TailPosition;

public abstract class Animal extends Character {
    private TailPosition tailPosition;

    protected Animal(String name, Place localPlace) {
        super(name, localPlace);
        this.tailPosition = TailPosition.UP;
    }
    protected Animal(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
        this.tailPosition = TailPosition.UP;
    }
    protected Animal(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tail) {
        super(name, localPlace, bodyPosition);
        this.tailPosition = tail;
        System.out.println("Хвост " + this.getName() + " " + this.getTailPosition());
    }

    public String getTailPosition() {
        return this.tailPosition.toString();
    }

    public void setTailPosition(TailPosition tailPosition) {
        if (this.tailPosition != tailPosition) {
            System.out.println("Положение хвоста " + this.getName() + " изменяется с \"" + this.getTailPosition() +
                    "\" на \"" + tailPosition.toString() + "\"");
            this.tailPosition = tailPosition;
        } else System.out.println("Хвост " + this.getName() + " все еще " + this.getTailPosition());
    }
}
