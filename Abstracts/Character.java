package Abstracts;

import Classes.MessageHistory;
import Classes.Place;
import Enums.BodyPosition;
import Enums.TypeOfGo;
import Enums.TypeOfJump;
import Enums.TypeOfSpeaking;
import Exceptions.MessageYourself;
import Exceptions.NegativeSpeed;
import Interfaces.*;

public abstract class Character implements AbleToSpeak, AbleToMove, AbleToHelp, AbleToGo, AbleToJump {
    protected Place localPlace;
    protected BodyPosition bodyPosition;
    private final String name;
    private TypeOfJump typeOfJump = TypeOfJump.NONE;
    private boolean isHelping = Boolean.FALSE;
    private int speed = 0;
    private TypeOfGo typeOfGo = TypeOfGo.STOP;
    private boolean haveMessage = Boolean.FALSE;
    private String lastMessage;
    private Character fromWhoMessage;
    private TypeOfSpeaking typeOfSpeaking = TypeOfSpeaking.SPEAK;

    protected Character(String name, Place place) {
        this.name = name;
        this.localPlace = place;
        this.bodyPosition = BodyPosition.STAND;
        System.out.println(this.getName() + " появляется. Локация: " + this.localPlace);
    }
    protected Character(String name, Place place, BodyPosition bodyPosition) {
        this.name = name;
        this.localPlace = place;
        this.bodyPosition = bodyPosition;
        System.out.println(this.getName() + " появляется. Локация: " + this.localPlace);
        System.out.println("Положение тела: " + this.bodyPosition);
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return this.name;
    }

    public void moveTo(Place place) {
        if (this.localPlace != place) {
            this.localPlace = place;
            System.out.println(this.getName() + " перемещается в другое место: " + localPlace.toString());
        } else System.out.println(this.getName() + " остается в локации: " + localPlace.toString());
    }

    public BodyPosition getBodyPosition() {
        return this.bodyPosition;
    }

    public void setBodyPosition(BodyPosition bodyPosition) {
        if (this.bodyPosition != bodyPosition) {
            System.out.println("Положение тела " + this.getName() + " изменяется с \"" + this.getBodyPosition() +
                    "\" на \"" + bodyPosition.toString() + "\"");
            this.bodyPosition = bodyPosition;
        } else System.out.println(this.getName() + " все еще " + getBodyPosition());

    }

    public void jump(TypeOfJump typeOfJump) {
        if (typeOfJump == TypeOfJump.NONE) {
            if (this.typeOfJump != TypeOfJump.NONE) {
                this.typeOfJump = TypeOfJump.NONE;
                System.out.println(this.getName() + " перестает прыгать");
            } else System.out.println(this.getName() + " все еще не прыгает");
        } else if (this.typeOfJump != typeOfJump) {
            this.typeOfJump = typeOfJump;
            System.out.println(this.getName() + " начинает прыгать " + typeOfJump.toString());
        } else System.out.println(this.getName() + " все еще прыгает " + typeOfJump.toString());
    }

    public TypeOfJump getTypeOfJump() {
        return this.typeOfJump;
    }

    public void help(Boolean b) {
        System.out.print(this.getName());
        if (b != isHelping) {
            isHelping = b;
            System.out.print(" теперь ");
        } else System.out.print(" все еще ");
        if (!isHelping) {
            System.out.print("не ");
        }
        System.out.println("помогает");
    }

    public boolean getIsHelping() {
        return this.isHelping;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            System.out.print(this.getName());
            if (this.speed != speed) {
                this.speed = speed;
            } else {
                System.out.println(" все еще " + this.typeOfGo.toString());
                return;
            }
            if (speed == 0) {
                this.typeOfGo = TypeOfGo.STOP;
            } else if (speed <= 8) {
                this.typeOfGo = TypeOfGo.GO;
            } else this.typeOfGo = TypeOfGo.RUN;
            System.out.println(" теперь " + this.typeOfGo.toString());
        } else throw new NegativeSpeed(speed);
    }

    public MovingContainer getMovingContainer() {
        class CharacterMovingContainer implements MovingContainer {
            final int speed = Character.this.speed;
            final TypeOfGo typeOfGo = Character.this.typeOfGo;
            final Place localPlace = Character.this.localPlace;

            public int getSpeed() {
                return speed;
            }

            public TypeOfGo getTypeOfGo() {
                return typeOfGo;
            }

            public Place getLocalPlace() {
                return localPlace;
            }

            @Override
            public String toString() {
                return ("Скорость: " + speed + ", тип: " + typeOfGo + ", локация: " + localPlace);
            }
        }
        return new CharacterMovingContainer();
    }

    public void say(String message, TypeOfSpeaking typeOfSpeaking) {
        System.out.println(this.getName() + " " + typeOfSpeaking + ": \"" + message + "\"");
        MessageHistory.addNewMessage(this, message, typeOfSpeaking);
    }

    public void say(String message) {
        System.out.println(this.getName() + " " + TypeOfSpeaking.SPEAK + ": \"" + message + "\"");
        MessageHistory.addNewMessage(this, message, this.typeOfSpeaking);
    }
    public void catchMessage(Character character, String message) {
        this.haveMessage = Boolean.TRUE;
        this.lastMessage = message;
        this.fromWhoMessage = character;
        System.out.println(this.getName() + " получает сообщение от " + character.getName());
    }

    public void sendMessage(Character character, String message) {
        if (!this.equals(character)) {
            System.out.print(this.getName() + " обращается к " + character.getName() + ": ");
            System.out.println("\"" + message + "\"");
            character.catchMessage(this, message);
            MessageHistory.addNewMessage(this, character, message, typeOfSpeaking);
        } else throw new MessageYourself(character);
    }

    public void answerMessage(String message) {
        System.out.print(this.getName() + " отвечает " + fromWhoMessage.getName() + ": ");
        System.out.println("\"" + message + "\"");
        haveMessage = Boolean.FALSE;
        MessageHistory.addNewMessage(this, fromWhoMessage, message, typeOfSpeaking);
    }
    public String getLastMessage() {
        return this.lastMessage;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character p = (Character) o;
        return this.hashCode() == p.hashCode();
    }

    @Override
    public int hashCode(){
        return name.hashCode() + this.getClass().hashCode();
    }
}

