package Classes;

import Interfaces.Destinationable;

public class Place implements Destinationable {
    private final String name;
    public Place(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Destinationable destinto() {
        return this;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place p = (Place)o;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
