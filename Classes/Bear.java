package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;
import Interfaces.Countable;

public class Bear extends Animal implements Countable {
    private Boolean isCount = Boolean.FALSE;

    public Bear(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Bear(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Bear(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    Countable count = number -> {
        isCount = Boolean.TRUE;
        System.out.print(getName() + " считает: ");
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + getName() + " досчитал");
        isCount = Boolean.FALSE;
    };

    public void countTo(int number) {
        count.countTo(number);
    }

    public Boolean getCount() {
        return isCount;
    }
}
