package Abstracts;

import Classes.Place;
import Interfaces.Destinationable;
import Interfaces.Talking;

public abstract class Character implements Destinationable, Talking {
    protected Destinationable localPlace;
    private final String name;

    public Destinationable destinto(){
        return localPlace;
    }

    protected Character(String name, Place place) {
        this.name = name;
        this.localPlace = place;
        System.out.println(this.getName() + " появляется. Локация: " + this.destinto());
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName(){
        return this.name;
    }

    public void help() {
        System.out.println(this.getName() + " старается помочь");
    }

    public void moveTo(Place place) {
        this.localPlace = place;
        System.out.println(this.getName() + " перемещается в другое место: " + localPlace.toString());
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character p = (Character) o;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    public abstract void say(String message);
}

