package Abstracts;

import Classes.Place;
import Enums.BodyPosition;
import Enums.TailPosition;

public abstract class Animals extends Character {
    private TailPosition tailPosition;

    protected  Animals(String name, Place localPlace) {
        super(name, localPlace);
    }
    protected Animals(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Animals(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tail) {
        super(name, localPlace, bodyPosition);
        this.tailPosition = tail;
        System.out.println("Хвост " + this.getName() + " " + this.getTailPosition());
    }

    public String getTailPosition() {
        return this.tailPosition.toString();
    }

    public void setTailPosition(TailPosition tailPosition) {
        try {
            if (this.tailPosition != tailPosition) {
                System.out.println("Положение хвоста " + this.getName() + " изменяется с \"" + this.getTailPosition() +
                        "\" на \"" + tailPosition.toString() + "\"");
                this.tailPosition = tailPosition;
            } else System.out.println("Хвост " + this.getName() + " все еще " + this.getTailPosition());
        } catch (NullPointerException e) {
            this.tailPosition = tailPosition;
            System.out.println("Хвост " + this.getName() + " теперь " + this.getTailPosition());
        }

    }
}
