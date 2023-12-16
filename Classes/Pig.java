package Classes;

import Abstracts.Animal;
import Enums.BodyPosition;
import Enums.State;
import Enums.TailPosition;
import Enums.TypeOfSpeaking;

public class Pig extends Animal {
    private State state;
    private final TypeOfSpeaking typeOfSpeaking = TypeOfSpeaking.SCREAM;

    public Pig(String name, Place localPlace) {
        super(name, localPlace);
    }
    public Pig(String name, Place localPlace, BodyPosition bodyPosition, State state) {
        super(name, localPlace, bodyPosition);
        this.state = state;
        System.out.println(this.getName() + " " + this.getState());
    }
    public Pig(String name, Place localPlace, BodyPosition bodyPosition, TailPosition tailPosition, State state) {
        super(name, localPlace, bodyPosition, tailPosition);
        this.state = state;
        System.out.println(this.getName() + " " + this.getState());
    }

    public String getState() {
        return this.state.toString();
    }

    public void setState(State state) {
        if (this.state != state){
            System.out.println("Уровень проснувшести " + this.getName() + " изменяется с \"" + this.getState() +
                    "\" на \"" + state.toString() + "\"");
            this.state = state;
        } else System.out.println(this.getName() + " все еще " + getBodyPosition());
    }

    @Override
    public void say(String message) {
        super.say(message, TypeOfSpeaking.SCREAM);
    }
}
