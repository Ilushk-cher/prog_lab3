package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.TailPosition;
import Interfaces.AbleToSwim;

public class Kangaroo extends Animal implements AbleToSwim {
    private boolean isSwimming = Boolean.FALSE;

    public Kangaroo(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Kangaroo(String name, Place localPlace, BodyPosition bodyPosition) {
        super(name, localPlace, bodyPosition);
    }
    public Kangaroo(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition) {
        super(name, localPlace, bodyPosition, tailPosition);
    }

    public void startSwim() {
        if (isSwimming == Boolean.FALSE) {
            isSwimming = Boolean.TRUE;
            System.out.println(this.getName() + " начинает плавать");
        }
        else System.out.println(this.getName() + " все еще плавает");
    }

    public void endSwim() {
        if (isSwimming == Boolean.TRUE) {
            isSwimming = Boolean.FALSE;
            System.out.println(this.getName() + " перестает плавать");
        }
        else System.out.println(this.getName() + " все еще не плавает");
    }


    public boolean getIsSwimming() {
        return this.isSwimming;
    }
}
